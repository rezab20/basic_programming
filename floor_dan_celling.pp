var N:real;
   c,f:longint;
   a,b:longint;
begin
readln(N);
if (N=trunc(N)) then begin
N:=trunc(N);
writeln(N:0:0,' ',N:0:0);
end else if (N<0) then begin
c:=trunc(N);
f:=c-1;
writeln(f,' ',c); end else begin
f:=trunc(N);
c:=f+1;
writeln(f,' ',c); end;
readln ;readln end.