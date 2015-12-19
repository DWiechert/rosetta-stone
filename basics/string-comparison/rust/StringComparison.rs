use std::cmp::Ordering;
use std::env;

fn main() {
    let mut args: Vec<_> = env::args().skip(1).collect();
    // Since we are popping the stack, arg2 comes first
    let s2 = args.pop().unwrap();
    let s1 = args.pop().unwrap();

    // These 2 comparison methods are equivalent
    if s1 < s2 {
        println!("{:?} is lexically before {:?}.", s1, s2);
    }
    if s1 == s2 {
        println!("{:?} is lexically equal to {:?}.", s1, s2);
    }
    if s1 > s2 {
        println!("{:?} is lexically after {:?}.", s1, s2);
    }

    match s1.cmp(&s2) {
        Ordering::Less    => println!("{:?} is lexically before {:?}.", s1, s2),
        Ordering::Equal   => println!("{:?} is lexically equal to {:?}.", s1, s2),
        Ordering::Greater => println!("{:?} is lexically after {:?}.", s1, s2),
    }
}
