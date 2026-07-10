#include <stdio.h>

int main() {
    int p, q;

    printf("--- Truth Table Generator ---\n");
    printf("P\tQ\tP AND Q\tP OR Q\tP -> Q\n");
    printf("---------------------------------------\n");

    // Loop through all possible combinations of truth values (0 for False, 1 for True)
    for (p = 1; p >= 0; p--) {
        for (q = 1; q >= 0; q--) {
            // 1. Conjunction (AND)
            int conjunction = p && q;

            // 2. Disjunction (OR)
            int disjunction = p || q;

            // 3. Implication (P -> Q is equivalent to !P || Q)
            int implication = !p || q;

            // Display the results
            printf("%d\t%d\t%d\t%d\t%d\n", p, q, conjunction, disjunction, implication);
        }
    }

    return 0;
}