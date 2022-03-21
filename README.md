# じゃんけんゲーム
javaでじゃんけんゲームのプログラムを書きました。<br>

## 関数

main関数の中身は主に4つの関数で動作しています。<br>

1.  getUser()関数<br>
2.  getComp()関数<br>
3.  judge()関数<br>
4.  printResult()関数<br>

### getUser()関数
プログラムを実行したユーザのじゃんけんの手を受け取る関数です。

### getComp()関数
コンピュータのじゃんけんの手を決める関数です。
疑似乱数を使用し、じゃんけんの手をランダムにしています。

### judge()関数
ユーザのじゃんけんの手とコンピュータのじゃんけんの手を比較しています。
結果に合わせて、変数resultに"勝ち"、"負け"、"あいこ"の三種類を代入しています。

### printResult()関数
プログラムの結果をコンソールに表示するための関数です。<br><br><br>

## プログラムの実行
### 入力値が正しい場合

![image](https://user-images.githubusercontent.com/101985652/159198382-b7d082b6-15ad-4758-993a-bb8112741b48.png)<br>
プログラムを実行するとコンソールにユーザへの指示が表示されます。<br><br>
![image](https://user-images.githubusercontent.com/101985652/159198534-170863da-d815-4b0c-bfae-14ebd7fa96dc.png)<br>
ユーザがじゃんけんの手を入力すると、コンピュータのじゃんけんの手が表示され、その下に結果が出ます。<br><br>

### 入力値が正しくない場合
![image](https://user-images.githubusercontent.com/101985652/159198822-d756b9bc-86ef-4858-b4f5-25d50eb06991.png)<br>
![image](https://user-images.githubusercontent.com/101985652/159198952-cc94fe18-0434-4b02-a5d2-efe5e62a1e7c.png)<br>

0、1、2以外の数値や文字を入力すると、上記のエラーが表示され、ユーザに再び入力を求めます。<br>
