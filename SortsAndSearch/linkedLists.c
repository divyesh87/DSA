#include <stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

int main() {
    
    struct Node* first;
    struct Node* second;
    struct Node* third;
    struct Node* ptr;
    
    first = malloc(sizeof(struct Node));
    second = malloc(sizeof(struct Node));
    third = malloc(sizeof(struct Node));
    ptr = malloc(sizeof(struct Node));
    
    ptr = first;
    
    first->data = 1;
    first->next = second;
    
    second->data = 2;
    second->next = third;
    
    third->data = 3;
    third->next = NULL;
    
    while(1){
        printf("%d => ", ptr->data);
        if(ptr->next == NULL){
            break;
        }
        ptr = ptr->next;
    }
    return 0;
}