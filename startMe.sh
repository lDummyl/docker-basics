javac src/ReadExternal.java
mv src/ReadExternal.class toContainer/ReadExternal.class
docker build toContainer -t myimage
abs=$(realpath data/in/input.txt)
echo $abs
docker run --name cntnr -v $abs:/root/basics/input.txt -t myimage
docker cp cntnr:/root/basics/output.txt data/out/result.txt


