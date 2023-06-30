class Demo{

Scanner sc =new Scanner(System.in);
System.out.println("Enter the no of element in the array");
int n= sc.nextInt();
System.out.println("Enter the element of the array");
int arr[]= new int[n];
for(int i=0; i<n; i++) {
arr[i]=sc.nextInt();
}
System.out.println("Enter target value of the array");
int target= sc.nextInt();
int low=0, high=arr.length-1;
int result=-1;
while(low<= high) {
int mid= low+(high-low)/2;
if(arr[mid]==target) {
result= mid;
break;
}
else if(arr[mid]<target) {
low=mid+1;
}
else {
high=mid-1;
}
}
//
if (result!=-1) {
System.out.println("element is found at the location: "+ result);
}
else {
System.out.println("element is not found");
}
