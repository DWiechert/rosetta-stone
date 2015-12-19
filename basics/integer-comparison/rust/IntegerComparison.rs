use std::env;

fn main() {
    let mut args: Vec<_> = env::args().skip(1).collect();
    // Since we are popping the stack, arg2 comes first
    let i2 = args.pop().unwrap().parse::<i32>().unwrap();
    let i1 = args.pop().unwrap().parse::<i32>().unwrap();
    if i1 < i2 {
        println!("{:?} is less than {:?}.", i1, i2);
    }
    if i1 == i2 {
        println!("{:?} is equal to {:?}.", i1, i2);
    }
    if i1 > i2 {
        println!("{:?} is greater than {:?}.", i1, i2);
    }
}
