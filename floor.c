#include <stdio.h>
#include <math.h>

int main() {
    double num;

    // Ask user for input
    printf("Enter a floating-point number: ");
    scanf("%lf", &num);

    // Calculate floor and ceiling
    double floor_val = floor(num);
    double ceil_val = ceil(num);

    // Display the results
    printf("\n--- Results ---\n");
    printf("Original Number: %.2f\n", num);
    printf("Floor value    : %.2f (Largest integer <= %.2f)\n", floor_val, num);
    printf("Ceiling value  : %.2f (Smallest integer >= %.2f)\n", ceil_val, num);

    return 0;
}