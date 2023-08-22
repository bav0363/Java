string [] Input(int size)
{
    string[] array = new string[size];    
    for (int index = 0; index < array.Length; index++)
    {
        Console.Write($"Введите [{index + 1}] элемент массива: ");
        array[index] = Convert.ToString(Console.ReadLine());
    }
    return array;
}

void ShowArray(string[] array)
{    
    for (int index = 0; index < array.Length; index++)
        Console.Write(array[index] + " ");
    Console.WriteLine();
}

string[] Treatment(string[] array)
{
    int count = 0;    
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length <= 3)
        {            
            count ++;
        }        
    }
    string[] new_array = new string[count];
    int index = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length <= 3)
        {
            new_array[index] = array[i];
            index ++;
        }        
    }
    return new_array;
} 


Console.WriteLine("Сколько элементов вы хотите записать в массив?");
int size = Convert.ToInt32(Console.ReadLine());
string[] my_array = Input(size);
Console.WriteLine("Начальный массив:");
ShowArray(my_array);
string[] new_array = Treatment(my_array);
Console.WriteLine("Обработанный массив:");
ShowArray(new_array);
