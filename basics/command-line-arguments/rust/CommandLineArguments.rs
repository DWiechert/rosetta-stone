use std::env;

fn main() {
    let args: Vec<_> = env::args().skip(1).collect();
    println!("{} arguments were provided:", args.len());
    for argument in args {
        println!("{}", argument);
    }
}
