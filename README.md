# PhysFuncLib

A Library of functions translated from my Physics class.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK 8 or higher)
-   A text editor or IDE (e.g., VS Code, IntelliJ IDEA, or Eclipse)

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/PhysFuncLib.git
    ```

### Project Structure:

-->PhysicsLibrary (PARENT INTERFACE)

--> Kinematics (CHILD INTERFACE)
--> calculateDisplacement()
--> calculateFinalVelocity()
--> calculateAcceleration()

--> Dynamics (CHILD INTERFACE)
--> calculateForce()
--> calculateMomentum()
--> calculateImpulse()

--> Energy (CHILD INTERFACE)
--> calculateKineticEnergy()
--> calculatePotentialEnergy()
--> calculateWorkDone()

--> Rotational Motion (CHILD INTERFACE)
--> calculateTorque()
--> calculateMomentOfInertia()
--> calculateAngularMomentum()

### GIT Conventions used in this project (Reminder for myself):

Using a consistent commit convention helps organize your codebase and provides clarity to collaborators (or your future self!). Here’s a simple and effective commit style you can follow:

Structure:
<type>: <short description>

Types to Use:

--> feat: Introduces a new function or feature.
Example: feat: add function for linear momentum calculations

--> fix: Fixes a bug or incorrect calculation.
Example: fix: correct sign error in gravitational potential energy function

--> refactor: Refactors code without changing functionality.
Example: refactor: simplify logic for angular velocity calculation

--> docs: Updates documentation, comments, or README files.
Example: docs: add usage examples for kinematics functions

--> test: Adds or modifies tests.
Example: test: add unit tests for energy conservation functions

--> style: Updates code formatting, indentation, or minor style changes.
Example: style: adjust spacing in vector operations

--> chore: Miscellaneous tasks like updating dependencies.
Example: chore: update README with library setup instructions

Examples of Commit Messages:
feat: add function for rotational kinetic energy
fix: correct unit conversion in fluid dynamics equations
refactor: optimize algorithm for calculating moment of inertia
docs: add derivation explanation for Hooke's Law
test: add tests for projectile motion functions
By following this structure, your repo will be organized and easy to maintain!
