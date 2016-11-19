def hw1(infile,outfile):
    f=open(infile,'r')
    f2=open(outfile,'w')
    for line in f:
        cur='a'
        value='true'
        count=0
        text=line
        b=list(text)
        for i in range(0,len(text)):
            for j in range(0,len(text)):
                if cur==b[j]:
                    count=count+1
                    cur=chr(ord(cur)+1)
                    break
        if(count==26):
            value='true'
        elif(count!=26):
            value='false'
        f2.write(value+'\n')
    f2.close()
    f.close()
