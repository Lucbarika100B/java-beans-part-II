# java-beans-part-II

Spring Framework for Enterprise Applications
Instructor Hamit Pena Sierra

Assignment II
1. Create an interface named CarBrand defining the method
a. String getBrandName()
2. Create 3 classes implementing the CarBrand interface:
a. Chevrolet
b. Dodge
c. Mazda
Each class must return the corresponding class name in the getBrandName
method implementation
3. Create a class named MazdaCar with the following attributes
a. String model
b. CarBrand brand
c. Double price
d. Encapsulate the fields
4. Enable the component scanning for all the packages containing the created
components
5. Using the created components, you must write an application to build Mazda Cars,
the application must ask a model and price, get from the Spring container a
MazdaCar object, which must have its CarBrand property set to an Object from the
Mazda class (autowired),
a. Set all the received values (model, price) into the MazdaCar object.
b. It must print the values for all the attributes in the created car
