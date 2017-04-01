package test

/**
 * Created by wangliang on 2017/4/1.
 */
class groovy {
    static void main(args) {
        def x = 1
        def singleQuote=  "I am $x dolloar"
        def multieLines = ''' begin
   line  1
   line  2
   end '''
        println(multieLines)
    }
}
