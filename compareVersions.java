class compareVersion{
    public static int compVersion(String version1,String version2){
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int count = Math.max(v1.length,v2.length);
        for(int i=0;i<count;i++){
            int a = i<v1.length ? Integer.parseInt(v1[i]) : 0;
            int b = i<v2.length ? Integer.parseInt(v2[i]) : 0;
            if(a>b){
                return 1;
            }
            else if(a<b){
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        String version1 = "1.2";
        String version2 = "1.10";
        System.out.println(compVersion(version1, version2));
    }
}