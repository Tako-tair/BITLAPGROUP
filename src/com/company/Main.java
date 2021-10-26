package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.nio.cs.ext.ISO2022_CN;

import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        res(arr);
    }

    public static void res (int [] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int buf =arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }










//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int count = 0;
//        int[][] arr = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//
//        int k = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0; i < m; i++){
//            System.out.print("-" + "\t");
//        }
//        System.out.println();
//        int[][]arr2 = new int[k][m];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[j][i] < 0){
//                    arr2[count][i] = arr[j][i];
//                    count++;
//                    if(count == k){
//                        break;
//                    }
//                }
//            }
//            count = 0;
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < m; j++) {
//                if(arr2[i][j] == 0){
//                    System.out.print("x" + "\t");
//                } else {
//                    System.out.print(arr2[i][j] + "\t");
//                }
//            }
//            System.out.println();
//        }




//                Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] a = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(a[i][j] == 0){
//                    System.out.println("n");
//                    sum = 0;
//                }else{
//                    sum += a[i][j];
//                }
//            }
//            if(sum ==0 )
//                continue;
//            System.out.println(sum);
//            sum = 0;
//        }





//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] a = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int k = sc.nextInt();
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("_ _ _");
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(count<=k){
//                    if(a[j][i]<0){
//                        count++;
//                    }
//                }
//            }
//        }



//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = m-1; j >=0 ; j--) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        int min = arr[0][0];
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//                if (arr[i][j] < min) {
//                    min = arr[i][j];
//                }
//            }
//        }
//        int sum = min;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == max) {
//                    arr[i][j] = min;
//                }
//                if (arr[i][j] == min) {
//                    arr[i][j] = max;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }




















//        int  n=10;
//        int[][] A = new int[n][n];
//        int i=1,j,k,p=n/2;
//        for(k=1;k<=p;k++){
//            for (j=k-1;j<n-k+1;j++)
//            A[k-1][j]=i++;
//            for (j=k;j<n-k+1;j++)
//            A[j][n-k]=i++;
//            for (j=n-k-1;j>=k-1;--j)
//            A[n-k][j]=i++;
//            for (j=n-k-1;j>=k;j--)
//            A[j][k-1]=i++;
//        }
//        for(i=0;i<n;i++)
//            for(j=0;j<n;j++){
//                System.out.print(A[i][j]);
//                if(j==n-1) System.out.println();
//            }


//        int[][] a = new int[3][4];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                a[i][j] = scan.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print (a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int first = 0;
//        int secn  = 0;
//        for (int i = 0; i < 3; i++) {
//            first = a[i][0];
//            secn = a[i][3];
//            a[i][0] = secn;
//            a[i][3] = first;
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print (a[i][j] + " ");
//            }
//            System.out.println();
//        }
//









//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        int n = s.length();
//        LinkedList<Double> numbers = new LinkedList<>();
//        LinkedList<Character>operations = new LinkedList<>();
//        double cur_num = 0;
//        for(int i = 0;i<n;i++){
//            if (Character.isDigit(s.charAt(i))){
//                cur_num = cur_num * 10 + (s.charAt(i)-48);
//            }else{
//                numbers.add(cur_num);
//                cur_num = 0;
//                operations.add(s.charAt(i));
//            }
//        }
//        numbers.add(cur_num);
//        for(int i = 0;i<operations.size();){
//            if (operations.get(i) == '*'){
//                numbers.set(i,numbers.get(i) * numbers.get(i+1));
//                numbers.remove(i+1);
//                operations.remove(i);
//            }else if (operations.get(i) == '/'){
//                numbers.set(i,numbers.get(i) / numbers.get(i+1));
//                numbers.remove(i+1);
//                operations.remove(i);
//            }else{
//                i++;
//            }
//        }
//        for(int i = 0;i<operations.size();){
//            if (operations.get(i) == '+'){
//                numbers.set(i, numbers.get(i) + numbers.get(i+1));
//                operations.remove(i);
//                numbers.remove(i+1);
//            }else if (operations.get(i) == '-'){
//                numbers.set(i, numbers.get(i) - numbers.get(i+1));
//                operations.remove(i);
//                numbers.remove(i+1);
//            }
//        }
//        System.out.println(numbers.get(0));








//        Scanner scan = new Scanner(System.in);
//        String strText = scan.nextLine();
//        StringTokenizer strT = new StringTokenizer(strText," ");
//
//
//        while (strT.hasMoreTokens()){
//            String strBuffer = strT.nextToken();
//            char [] symbolsBuffer = strBuffer.toCharArray();
//            char [] symbolsRes = new char[symbolsBuffer.length];
//            for (int i=symbolsBuffer.length-1,j=0;i>=0;i--,j++){
//                symbolsRes[j] = symbolsBuffer[i];
//            }
//            String strRes = String.valueOf(symbolsRes);
//            System.out.print(strRes +" ");
//        }





//            String a = scan.nextLine();
//            StringTokenizer st = new StringTokenizer(a," ");
//            while (st.hasMoreTokens()){
//                String sub = st.nextToken();
//                switch (sub){
//                    case "one":
//                        System.out.print(1 + " ");
//                        break;
//                    case "two":
//                        System.out.print(2 + " ");
//                        break;
//                    case "three":
//                        System.out.print(3 + " ");
//                        break;
//                    case "four":
//                        System.out.print(4 + " ");
//                        break;
//                    case "five":
//                        System.out.print(5 + " ");
//                        break;
//                    case "six":
//                        System.out.print(6 + " ");
//                        break;
//                    case "seven":
//                        System.out.print(7 + " ");
//                        break;
//                    case "eight":
//                        System.out.print(8 + " ");
//                        break;
//                    case "nine":
//                        System.out.print(9 + " ");
//                        break;
//                    case "0":
//                        System.out.print(0 + " ");
//                        break;
//                    default:
//                        System.out.print(sub + " ");
//                }
//            }















//                String s = "assa";
//                if (s.charAt(0)==' ' || s.charAt(s.length()-1)==' '){
//                    System.out.println("("+ s.trim() +")");
//                }else {
//                    System.out.println(s);
//                }
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//                int[] a = new int[n];
//                // int sum = 0;
//                for(int i = 0;i < n;i++) {
//                    a[i] = sc.nextInt();
//                }
//                boolean isTrue = false;
//                for (int i = 0; i < n-1; i++) {
//                    if((a[i] > 0 && a[i+1] < 0) || (a[i] < 0 && a[i+1] > 0)){
//                        isTrue = true;
//                    }else{
//                        isTrue = false;
//                        break;
//                    }
//                }
//                if(isTrue) {
//                    System.out.println("YES");
//                } else System.out.println("NO");



//                if(mass[0]>0) {
//                    for (int i = 0; i < a; i+=2) {
//                        if (mass[i]>0)
//                            sum1++;
//                    }
//                }else{
//                    for (int i = 0; i < a; i+=2) {
//                        if (mass[i]<0)
//                            sum1++;
//                    }
//                }
//                if(mass.length/2<=sum1){
//                    System.out.println("yes");
//                }else {
//                    System.out.println("no");
//                }
//                if(mass.length/2<=sum2){
//                    System.out.println("yes");
//                }else {
//                    System.out.println("no");
//                }



                




//        int a = 5;
//        while(a>0){
//            System.out.println("Hello: " + a);
//            a--;
//            if(a==2)
//                break;
//        }
//        do{
//            System.out.println("Hello");
//        }while(true);


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Choose your branch:");
//        System.out.println("1 - Science");
//        System.out.println("2 - Humanitarian subjects");
//        System.out.println("3 - Art");
//        System.out.println("4 - Sport");
//        int branch = scan.nextInt();
//        if(branch == 1){
//            System.out.println("Вы выбрали Science - Науку");
//            System.out.println("1 - Math, 2 - Physics:");
//            int profession = scan.nextInt();
//            if(profession == 1){
//                System.out.println("You are Financier");
//            }else{
//                System.out.println("You are Engineer");
//            }
//        }else if(branch == 2){
//            System.out.println("Вы выбрали Humanitarian subjects - Гуманитарные предметы");
//            System.out.println("1 - History, 2 - Foreign Languages:");
//            int profession = scan.nextInt();
//            if(profession == 1){
//                System.out.println("You are Historic or Diplomat");
//            }else{
//                System.out.println("You are Translator");
//            }
//        }else if(branch == 3){
//            System.out.println("Вы выбрали Art - Искусство");
//            System.out.println("1 - Drawing, 2 - Singing:");
//            int profession = scan.nextInt();
//            if(profession == 1){
//                System.out.println("You are Painter or Architect");
//            }else{
//                System.out.println("You are Singer or Tamada");
//            }
//        }else if(branch == 4){
//            System.out.println("Вы выбрали Sport - Спорт");
//            System.out.println("1 - Team, 2 - Individual:");
//            int profession = scan.nextInt();
//            if(profession == 1){
//                System.out.println("You are footballer or Basketball player");
//            }else{
//                System.out.println("You are boxer or tennis player");
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//
//        int max = 0;
//        int min = 0;
//        if (a>b && a>c) {
//            max = a;
//        }else if (b > a && b > c)
//            max = b;
//        else{
//            max = c;
//        }
//
//        if (a<b && a<c) {
//            min = a;
//        }else if (b < a && b < c)
//            min = b;
//        else{
//            min = c;
//        }
//        System.out.println(max-min);




//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println("Choose currency:\n\t[1] USD\n\t[2] EUR\n\t[3] RUB");
//        int b = scanner.nextInt();
//        if(b == 1){
//            System.out.println(a/420d + " USD");
//        }else if(b == 2){
//            System.out.println(a/510d + " EUR");
//        }else if (b == 3){
//            System.out.println(a/5.8d + " RUB");
//        }
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        int max = 0;
//        int min = 0;
//        if(a>b && a>c){
//            max = a;
//        }else  if(b>a && b>c){
//            max = b;
//        }else{
//            max = c;
//        }
//        System.out.println(max-min);
//        Scanner scanner = new Scanner(System.in);
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c= in.nextInt();
//        int d =in.nextInt();
//        if (a>b && a>c && a>d) {
//            if(a%2==0){
//                System.out.println(a);
//            }
//        } else if( b>a && b>c && b>d){
//            if(b%2==0){
//                System.out.println(b);
//            }
//        }else if( c>a && c>b && c>d){
//            if( c%2==0) {
//                System.out.println(c);
//            }
//        }else if(d>a && d>b && d>c){
//            if(d%2==0){
//            System.out.println(d);
//            }
//        } else {
//                System.out.println("not found");
//        }
    }
}
