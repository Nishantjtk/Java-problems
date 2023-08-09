public class a1q4 {
    public static void main(String[] args) {
        char ch[]={'C','A','R','B'};
        String s="";
        int c=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                    for(int l=0;l<4;l++)
                    {
                        if(i!=j && i!=k && i!=l && j!=k && j!=l &&  k!=l )
                        {
                        s=s+ch[i]+ch[j]+ch[k]+ch[l];    
                        System.out.println(s);
                        s="";
                        c++;
                        }
                    }
                }
            }
        }
        System.out.println("number of words formed :"+c);


    }
    
}
