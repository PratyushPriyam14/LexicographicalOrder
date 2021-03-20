import java.io.*;
import java.util.*;
public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //suppose we have to print lexico where n=1000 (like dictionary)
        //logic recursion will be call 1 to 9 times for 1000
        for (int i = 1; i <= 9; i++) {
            dfs(i, n);
        }
    }
        public static void dfs ( int i, int n){
            //base case
            if (i > n) {
                return;
            }
            //first print i then print there family by making call inside loop
            System.out.println(i); //suppos i=1 //here we first printed 1
            for (int j = 0; j < 10; j++) {//making loop for recursion call for prinring family family of 1 is 1,10,100,1000,101,102,103,104,105,106,107,108,109,11,110,111,112,113,114,115....199
                dfs(10 * i + j, n); //so i=1 and j=0 so dfs will become dfs(10,n)call it will print family of 10  it is faith
            }

        }
    }
/*
input
30
output 
1
10
11
12
13
14
15
16
17
18
19
2
20
21
22
23
24
25
26
27
28
29
3
30
4
5
6
7
8
9
/*
