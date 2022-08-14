let array = [1,3,5,2,2];
let left_sum = 0 ;
let right_sum = 0;

for (let i = 0; i < array.length ; i++)
{
    left_sum += array[i]
    right_sum += array[(array.length -1) - i]

    if(left_sum == right_sum)
    {
        console.log(array[i+1]);
        break;
    }
}
