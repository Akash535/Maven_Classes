50 Maven Classes;


Class 1:
	class bag{
	String type;
	String brandname;
	float price;
	float weight;
	float capacity;
	float hight,width;
	String colour;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		this.hight = hight;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "bag [type=" + type + ", brandname=" + brandname + ", price=" + price + ", weight=" + weight
				+ ", capacity=" + capacity + ", hight=" + hight + ", width=" + width + ", colour=" + colour + "]";
	}
	
	
}
------------------------------------------------------------------------------------------
config.xml :
	

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="bag">

			<property name="type">

				<value>SchoolBag</value>

			</property>
			<property name="brandname">

				<value>Skybags</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="hight">

				<value>4</value>

			</property>
			<property name="width">

				<value>2</value>

			</property>
			<property name="capacity">

				<value>2</value>

			</property>
			<property name="colour">

				<value>Black</value>

			</property>


		</bean>

	</beans>
__________________________________________________________________________________________
Class 2:
	class CPU{
	String color;
	int height,price,validity;
	int weight,ram,rom,version,generation;
	String brand;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	@Override
	public String toString() {
		return "CPU [color=" + color + ", height=" + height + ", price=" + price + ", validity=" + validity
				+ ", weight=" + weight + ", ram=" + ram + ", rom=" + rom + ", version=" + version + ", generation="
				+ generation + ", brand=" + brand + "]";
	}
	
	
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="bag">

			<property name="version">

				<value>9.8</value>

			</property>
			<property name="ram">

			<value>6</value>

			</property>
			<property name="rom">

			<value>128</value>

			</property>
			<property name="brand">

				<value>MI</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="height">

				<value>4</value>

			</property>
			<property name="width">

				<value>2</value>

			</property>
			<property name="validity">

				<value>2</value>

			</property>
			<property name="color">

				<value>Black</value>

			</property>
			<property name="generation">

			<value>11</value>

			</property>


		</bean>

	</beans>
__________________________________________________________________________________________

Class 3:
	class soap{
	int price;
	String name,brand,smell,weight,expirydate,capacity,usage,mfgdate;
	double mobileno;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSmell() {
		return smell;
	}
	public void setSmell(String smell) {
		this.smell = smell;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "soap [price=" + price + ", name=" + name + ", brand=" + brand + ", smell=" + smell + ", weight="
				+ weight + ", expirydate=" + expirydate + ", capacity=" + capacity + ", usage=" + usage + ", mfgdate="
				+ mfgdate + ", mobileno=" + mobileno + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="soap">

			<property name="name">

				<value>Lux</value>

			</property>
			<property name="smell">

			<value>Rose</value>

			</property>
			<property name="expirydate">

			<value>2022</value>

			</property>
			<property name="brand">

				<value>LUX</value>

			</property>
			<property name="price">

				<value>15</value>

			</property>
			<property name="weight">

				<value>100</value>

			</property>
			<property name="height">

				<value>2.5</value>

			</property>
			<property name="width">

				<value>2</value>

			</property>
			<property name="capacity">

				<value>4</value>

			</property>
			<property name="mfgdate">

				<value>2021</value>

			</property>
			<property name="usage">

			<value>HandWash</value>

			</property>
			<property name="mobileno">

			<value>0234589</value>

			</property>

		</bean>

	</beans>
__________________________________________________________________________________________

Class 4:	
	class customer{
	int id;
	String name;
	int edu;
	int age,pincode;
	String address,cource,salary,dist;
	double phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdu() {
		return edu;
	}
	public void setEdu(int edu) {
		this.edu = edu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", edu=" + edu + ", age=" + age + ", pincode=" + pincode
				+ ", address=" + address + ", cource=" + cource + ", salary=" + salary + ", dist=" + dist + ", phone="
				+ phone + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="customer">

			<property name="name">

				<value>Sachin</value>

			</property>
			<property name="id">

			<value>10</value>

			</property>
			<property name="edu">

			<value>BE</value>

			</property>
			<property name="age">

				<value>21</value>

			</property>
			<property name="pincode">

				<value>411014</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

			</property>
			<property name="cource">

				<value>JAVA</value>

			</property>
			<property name="salary">

				<value>20000</value>

			</property>
			<property name="dist">

				<value>Pune</value>

			</property>
			<property name="phone">

				<value>7972897599</value>

		

		</bean>

	</beans>
__________________________________________________________________________________________

Class 5: 
	class gastank{
		float price;
		String name;
		int kg;
		int hight;
		int address;
		double phone;
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKg() {
			return kg;
		}
		public void setKg(int kg) {
			this.kg = kg;
		}
		public int getHight() {
			return hight;
		}
		public void setHight(int hight) {
			this.hight = hight;
		}
		public int getAddress() {
			return address;
		}
		public void setAddress(int address) {
			this.address = address;
		}
		public double getPhone() {
			return phone;
		}
		public void setPhone(double phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "gastank [price=" + price + ", name=" + name + ", kg=" + kg + ", hight=" + hight + ", address="
					+ address + ", phone=" + phone + "]";
		}
		
	}
	
------------------------------------------------------------------------------------------
config.xml :

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="gastank">

			<property name="price">

				<value>5000</value>

			</property>
			<property name="name">

			<value>HP</value>

			</property>
			<property name="kg">

			<value>15</value>

			</property>
			<property name="height">

				<value>6</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

			</property>

			<property name="phone">

				<value>7972897599</value>

		

		</bean>

	</beans>
	
__________________________________________________________________________________________

Class 6:
	class window{
	int price;
	String height,compamy,material,weight,size,capacity,color,type,address;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getCompamy() {
		return compamy;
	}
	public void setCompamy(String compamy) {
		this.compamy = compamy;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "window [price=" + price + ", height=" + height + ", compamy=" + compamy + ", material=" + material
				+ ", weight=" + weight + ", size=" + size + ", capacity=" + capacity + ", color=" + color + ", type="
				+ type + ", address=" + address + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="window">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="height">

			<value>10</value>

			</property>
			<property name="company">

			<value>Jagwr</value>

			</property>
			<property name="material">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="size">

				<value>5</value>

			</property>
			<property name="capacity">

				<value>5</value>

			</property>
			<property name="color">

				<value>Black</value>

			</property>
			<property name="type">

				<value>Mix</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

		

		</bean>

	</beans>
__________________________________________________________________________________________

Class 7:
	class shoes{
	int price;
	String color,brand,discount,type,weight,quality,fabric,pattern,address;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "shoes [price=" + price + ", color=" + color + ", brand=" + brand + ", discount=" + discount + ", type="
				+ type + ", weight=" + weight + ", quality=" + quality + ", fabric=" + fabric + ", pattern=" + pattern
				+ ", address=" + address + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :
	
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="shoes">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="color">

			<value>Black</value>

			</property>

			</property>
			<property name="brand">

			<value>Sparx</value>

			</property>
			<property name="discount">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="type">

				<value>Sport</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="fabric">

				<value>Cloth</value>

			</property>
			<property name="pattern">

				<value>Stylish</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

		

		</bean>

	</beans>

__________________________________________________________________________________________

Class 8:
	class steel{
	int price;
	String name,company,color,weight,type,size,quality,discount,address;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "steel [price=" + price + ", name=" + name + ", company=" + company + ", color=" + color + ", weight="
				+ weight + ", type=" + type + ", size=" + size + ", quality=" + quality + ", discount=" + discount
				+ ", address=" + address + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="steel">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="name">

			<value>Round</value>

			</property>

			</property>
			<property name="company">

			<value>Msteel</value>

			</property>
			<property name="discount">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="color">

				<value>white</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="type">

				<value>Cloth</value>

			</property>
			<property name="discount">

				<value>Stylish</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

		

		</bean>

	</beans>
__________________________________________________________________________________________

Class 9:
	class sand{
	int price;
	String name,company,color,weight,type,size,quality,discount,address;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "sand [price=" + price + ", name=" + name + ", company=" + company + ", color=" + color + ", weight="
				+ weight + ", type=" + type + ", size=" + size + ", quality=" + quality + ", discount=" + discount
				+ ", address=" + address + "]";
	}
	 
}
------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="sand">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="name">

			<value>Round</value>

			</property>

			</property>
			<property name="company">

			<value>Msteel</value>

			</property>
			<property name="discount">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="color">

				<value>white</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="type">

				<value>Cloth</value>

			</property>
			<property name="discount">

				<value>Stylish</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

		

		</bean>

	</beans>

__________________________________________________________________________________________

Class 10:
	class breks{
	int price;
	String name,company,color,weight,type,size,quality,discount,address;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "breks [price=" + price + ", name=" + name + ", company=" + company + ", color=" + color + ", weight="
				+ weight + ", type=" + type + ", size=" + size + ", quality=" + quality + ", discount=" + discount
				+ ", address=" + address + "]";
	}	
	
}
------------------------------------------------------------------------------------------
config.xml :

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="breks">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="name">

			<value>Round</value>

			</property>

			</property>
			<property name="company">

			<value>Msteel</value>

			</property>
			<property name="discount">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="color">

				<value>white</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="type">

				<value>Cloth</value>

			</property>
			<property name="discount">

				<value>Stylish</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

		

		</bean>

	</beans>
__________________________________________________________________________________________

Class11:
	class newspaper{
	String price,brand;
	int height,author,validity;
	int weight,version,generation;
	String address,bookname;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	@Override
	public String toString() {
		return "newspaper [price=" + price + ", brand=" + brand + ", height=" + height + ", author=" + author
				+ ", validity=" + validity + ", weight=" + weight + ", version=" + version + ", generation="
				+ generation + ", address=" + address + ", bookname=" + bookname + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="newspaper">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="brand">

			<value>Lokmat</value>

			</property>

			</property>
			<property name="height">

			<value>2</value>

			</property>
			<property name="author">

				<value>S.R.Powar</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="color">

				<value>white</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="type">

				<value>Cloth</value>

			</property>
			<property name="validaty">

				<value>1</value>

			</property>
			<property name="version">

				<value>2</value>
				</property>
				<property name="generation">

				<value>20</value>
				</property>
				<property name="bookname">

				<value>SahiBaaat</value>
				</property>
		
				<property name="address">

				<value>VimanNagar</value>
				</property>

		</bean>

	</beans>
__________________________________________________________________________________________
	
Class 12:
		class student{
			int id;
			String name;
			int marks;
			int age,pincode;
			String address,branch,cource,dist;
			double phone;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getBranch() {
				return branch;
			}
			public void setBranch(String branch) {
				this.branch = branch;
			}
			public String getCource() {
				return cource;
			}
			public void setCource(String cource) {
				this.cource = cource;
			}
			public String getDist() {
				return dist;
			}
			public void setDist(String dist) {
				this.dist = dist;
			}
			public double getPhone() {
				return phone;
			}
			public void setPhone(double phone) {
				this.phone = phone;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getMarks() {
				return marks;
			}
			public void setMarks(int marks) {
				this.marks = marks;
			}
			@Override
			public String toString() {
				return "student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + ", pincode="
						+ pincode + ", address=" + address + ", branch=" + branch + ", cource=" + cource + ", dist="
						+ dist + ", phone=" + phone + "]";
			}
			
		}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="student">

			<property name="id">

				<value>20</value>

			</property>
			<property name="name">

			<value>Sachin</value>

			</property>

			</property>
			<property name="Marks">

			<value>90</value>

			</property>
			<property name="age">

				<value>21</value>

			</property>
			<property name="branch">

				<value>CSE</value>

			</property>
			
			<property name="pincode">

			<value>411014</value>

		</property>
		<property name="address">

			<value>VimanNagar</value>

		</property>
		<property name="cource">

			<value>JAVA</value>

		</property>
	
		<property name="dist">

			<value>Pune</value>

		</property>
		<property name="phone">

			<value>7972897599</value>
				</property>
		
				

		</bean>

	</beans>
__________________________________________________________________________________________

Class 13:
		class Book{
			String price,brand;
			int height,author,validity;
			int weight,version,generation;
			String address,bookname;
			public String getPrice() {
				return price;
			}
			public void setPrice(String price) {
				this.price = price;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public int getHeight() {
				return height;
			}
			public void setHeight(int height) {
				this.height = height;
			}
			public int getAuthor() {
				return author;
			}
			public void setAuthor(int author) {
				this.author = author;
			}
			public int getValidity() {
				return validity;
			}
			public void setValidity(int validity) {
				this.validity = validity;
			}
			public int getWeight() {
				return weight;
			}
			public void setWeight(int weight) {
				this.weight = weight;
			}
			public int getVersion() {
				return version;
			}
			public void setVersion(int version) {
				this.version = version;
			}
			public int getGeneration() {
				return generation;
			}
			public void setGeneration(int generation) {
				this.generation = generation;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getBookname() {
				return bookname;
			}
			public void setBookname(String bookname) {
				this.bookname = bookname;
			}
			@Override
			public String toString() {
				return "Book [price=" + price + ", brand=" + brand + ", height=" + height + ", author=" + author
						+ ", validity=" + validity + ", weight=" + weight + ", version=" + version + ", generation="
						+ generation + ", address=" + address + ", bookname=" + bookname + "]";
			}
			
		}
------------------------------------------------------------------------------------------
config.xml :
	
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Book">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="brand">

			<value>Lokmat</value>

			</property>

			</property>
			<property name="height">

			<value>2</value>

			</property>
			<property name="author">

				<value>S.R.Powar</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="color">

				<value>white</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="type">

				<value>Cloth</value>

			</property>
			<property name="validaty">

				<value>1</value>

			</property>
			<property name="version">

				<value>2</value>
				</property>
				<property name="generation">

				<value>20</value>
				</property>
				<property name="bookname">

				<value>SahiBaaat</value>
				</property>
		
				<property name="address">

				<value>VimanNagar</value>
				</property>

		</bean>

	</beans>

__________________________________________________________________________________________
		
Class 14:
		class Album{
			String price,artist,titel;
			int validity,year;
			int weight,version,generation;
			String address,mobileNo;
			public String getPrice() {
				return price;
			}
			public void setPrice(String price) {
				this.price = price;
			}
			public String getArtist() {
				return artist;
			}
			public void setArtist(String artist) {
				this.artist = artist;
			}
			public String getTitel() {
				return titel;
			}
			public void setTitel(String titel) {
				this.titel = titel;
			}
			public int getValidity() {
				return validity;
			}
			public void setValidity(int validity) {
				this.validity = validity;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public int getWeight() {
				return weight;
			}
			public void setWeight(int weight) {
				this.weight = weight;
			}
			public int getVersion() {
				return version;
			}
			public void setVersion(int version) {
				this.version = version;
			}
			public int getGeneration() {
				return generation;
			}
			public void setGeneration(int generation) {
				this.generation = generation;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getMobileNo() {
				return mobileNo;
			}
			public void setMobileNo(String mobileNo) {
				this.mobileNo = mobileNo;
			}
			@Override
			public String toString() {
				return "Album [price=" + price + ", artist=" + artist + ", titel=" + titel + ", validity=" + validity
						+ ", year=" + year + ", weight=" + weight + ", version=" + version + ", generation="
						+ generation + ", address=" + address + ", mobileNo=" + mobileNo + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Album">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="artist">

			<value>Powar</value>

			</property>

			</property>
			<property name="title">

			<value>ProjectShow</value>

			</property>
			<property name="author">

				<value>S.R.Powar</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="year">

				<value>2021</value>

			</property>
			<property name="mobileNo">

				<value>7972897599</value>

			</property>
			
			<property name="validaty">

				<value>1</value>

			</property>
			<property name="version">

				<value>2</value>
				</property>
				<property name="generation">

				<value>20</value>
				</property>
				
		
				<property name="address">

				<value>VimanNagar</value>
				</property>

		</bean>

	</beans>
__________________________________________________________________________________________

Class 15:
		class Laptop{
			String color;
			int height,price,validity;
			int weight,ram,rom,version,generation;
			String brand;
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public int getHeight() {
				return height;
			}
			public void setHeight(int height) {
				this.height = height;
			}
			public int getRam() {
				return ram;
			}
			public void setRam(int ram) {
				this.ram = ram;
			}
			public int getRom() {
				return rom;
			}
			public void setRom(int rom) {
				this.rom = rom;
			}
			public int getWeight() {
				return weight;
			}
			public void setWeight(int weight) {
				this.weight = weight;
			}
			public int getVersion() {
				return version;
			}
			public void setVersion(int version) {
				this.version = version;
			}
			public int getGeneration() {
				return generation;
			}
			public void setGeneration(int generation) {
				this.generation = generation;
			}
			@Override
			public String toString() {
				return "Laptop [color=" + color + ", height=" + height + ", price=" + price + ", validity=" + validity
						+ ", weight=" + weight + ", ram=" + ram + ", rom=" + rom + ", version=" + version
						+ ", generation=" + generation + ", brand=" + brand + "]";
			}
			
			
		}
------------------------------------------------------------------------------------------
config.xml :

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Laptop">

			<property name="version">

				<value>9.8</value>

			</property>
			<property name="ram">

			<value>6</value>

			</property>
			<property name="rom">

			<value>128</value>

			</property>
			<property name="brand">

				<value>MI</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="height">

				<value>4</value>

			</property>
			<property name="width">

				<value>2</value>

			</property>
			<property name="validity">

				<value>2</value>

			</property>
			<property name="color">

				<value>Black</value>

			</property>
			<property name="generation">

			<value>11</value>

			</property>
			
			<property name="version">

			<value>2</value>
			</property>


		</bean>

	</beans>
__________________________________________________________________________________________

Class 16:
	class tuthpest{
	int price;
	String name,brand,smell,weight,expirydate,capacity,usage,mfgdate;
	double mobileno;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSmell() {
		return smell;
	}
	public void setSmell(String smell) {
		this.smell = smell;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "tuthpest [price=" + price + ", name=" + name + ", brand=" + brand + ", smell=" + smell + ", weight="
				+ weight + ", expirydate=" + expirydate + ", capacity=" + capacity + ", usage=" + usage + ", mfgdate="
				+ mfgdate + ", mobileno=" + mobileno + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="tuthpest">

			<property name="name">

				<value>Lux</value>

			</property>
			<property name="smell">

			<value>Rose</value>

			</property>
			<property name="expirydate">

			<value>2022</value>

			</property>
			<property name="brand">

				<value>LUX</value>

			</property>
			<property name="price">

				<value>15</value>

			</property>
			<property name="weight">

				<value>100</value>

			</property>
			<property name="height">

				<value>2.5</value>

			</property>
			<property name="width">

				<value>2</value>

			</property>
			<property name="capacity">

				<value>4</value>

			</property>
			<property name="mfgdate">

				<value>2021</value>

			</property>
			<property name="usage">

			<value>HandWash</value>

			</property>
			<property name="mobileno">

			<value>0234589</value>

			</property>

		</bean>

	</beans>
__________________________________________________________________________________________

Class 17:
		class emp{
			int id;
			String name;
			int edu;
			int age,pincode;
			String address,cource,salary,dist;
			double phone;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getEdu() {
				return edu;
			}
			public void setEdu(int edu) {
				this.edu = edu;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getCource() {
				return cource;
			}
			public void setCource(String cource) {
				this.cource = cource;
			}
			public String getSalary() {
				return salary;
			}
			public void setSalary(String salary) {
				this.salary = salary;
			}
			public String getDist() {
				return dist;
			}
			public void setDist(String dist) {
				this.dist = dist;
			}
			public double getPhone() {
				return phone;
			}
			public void setPhone(double phone) {
				this.phone = phone;
			}
			@Override
			public String toString() {
				return "emp [id=" + id + ", name=" + name + ", edu=" + edu + ", age=" + age + ", pincode=" + pincode
						+ ", address=" + address + ", cource=" + cource + ", salary=" + salary + ", dist=" + dist
						+ ", phone=" + phone + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="customer">

			<property name="name">

				<value>Sachin</value>

			</property>
			<property name="id">

			<value>10</value>

			</property>
			<property name="edu">

			<value>BE</value>

			</property>
			<property name="age">

				<value>21</value>

			</property>
			<property name="pincode">

				<value>411014</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

			</property>
			<property name="cource">

				<value>JAVA</value>

			</property>
			<property name="salary">

				<value>20000</value>

			</property>
			<property name="dist">

				<value>Pune</value>

			</property>
			<property name="phone">

				<value>7972897599</value>

		

		</bean>

	</beans>

__________________________________________________________________________________________

Class 18:
		class Perfume{
			int price;
			String name,brand,smell,weight,expirydate,capacity,usage,mfgdate;
			double mobileno;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getSmell() {
				return smell;
			}
			public void setSmell(String smell) {
				this.smell = smell;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getExpirydate() {
				return expirydate;
			}
			public void setExpirydate(String expirydate) {
				this.expirydate = expirydate;
			}
			public String getCapacity() {
				return capacity;
			}
			public void setCapacity(String capacity) {
				this.capacity = capacity;
			}
			public String getUsage() {
				return usage;
			}
			public void setUsage(String usage) {
				this.usage = usage;
			}
			public String getMfgdate() {
				return mfgdate;
			}
			public void setMfgdate(String mfgdate) {
				this.mfgdate = mfgdate;
			}
			public double getMobileno() {
				return mobileno;
			}
			public void setMobileno(double mobileno) {
				this.mobileno = mobileno;
			}
			@Override
			public String toString() {
				return "Perfume [price=" + price + ", name=" + name + ", brand=" + brand + ", smell=" + smell
						+ ", weight=" + weight + ", expirydate=" + expirydate + ", capacity=" + capacity + ", usage="
						+ usage + ", mfgdate=" + mfgdate + ", mobileno=" + mobileno + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- bean definitions here -->
	<bean id="sob" class="soap">

		<property name="name">

			<value>Lux</value>

		</property>
		<property name="smell">

		<value>Rose</value>

		</property>
		<property name="expirydate">

		<value>2022</value>

		</property>
		<property name="brand">

			<value>LUX</value>

		</property>
		<property name="price">

			<value>15</value>

		</property>
		<property name="weight">

			<value>100</value>

		</property>
		<property name="height">

			<value>2.5</value>

		</property>
		<property name="width">

			<value>2</value>

		</property>
		<property name="capacity">

			<value>4</value>

		</property>
		<property name="mfgdate">

			<value>2021</value>

		</property>
		<property name="usage">

		<value>HandWash</value>

		</property>
		<property name="mobileno">

		<value>0234589</value>

		</property>

	</bean>

</beans>

__________________________________________________________________________________________

Class 19:
		class Pen{
			int price;
			String name,brand,color,weight,type,height,qulity,performance;
			double mobileno;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getHeight() {
				return height;
			}
			public void setHeight(String height) {
				this.height = height;
			}
			public String getQulity() {
				return qulity;
			}
			public void setQulity(String qulity) {
				this.qulity = qulity;
			}
			public String getPerformance() {
				return performance;
			}
			public void setPerformance(String performance) {
				this.performance = performance;
			}
			public double getMobileno() {
				return mobileno;
			}
			public void setMobileno(double mobileno) {
				this.mobileno = mobileno;
			}
			@Override
			public String toString() {
				return "Pen [price=" + price + ", name=" + name + ", brand=" + brand + ", color=" + color + ", weight="
						+ weight + ", type=" + type + ", height=" + height + ", qulity=" + qulity + ", performance="
						+ performance + ", mobileno=" + mobileno + "]";
			}
			
		}
------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- bean definitions here -->
	<bean id="sob" class="pen">

		<property name="name">

			<value>Lux</value>

		</property>
		<property name="brand">

		<value>Tramax</value>

		</property>
		<property name="color">

		<value>blue</value>

		</property>
		<property name="price">

			<value>15</value>

		</property>
		<property name="weight">

			<value>100</value>

		</property>
		<property name="height">

			<value>2.5</value>

		</property>
		<property name="width">

			<value>2</value>

		</property>
		<property name="quality">

			<value></value>

		</property>
		<property name="performance">

			<value>2021</value>

		</property>
		<property name="type">

		<value>Plastic</value>

		</property>
		<property name="mobileno">

		<value>0234589</value>

		</property>

	</bean>

</beans>

__________________________________________________________________________________________

Class 20:
	class Pencil{
	int price;
	String name,brand,color,weight,type,height,qulity,performance;
	double mobileno;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getQulity() {
		return qulity;
	}
	public void setQulity(String qulity) {
		this.qulity = qulity;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Pencil [price=" + price + ", name=" + name + ", brand=" + brand + ", color=" + color + ", weight="
				+ weight + ", type=" + type + ", height=" + height + ", qulity=" + qulity + ", performance="
				+ performance + ", mobileno=" + mobileno + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- bean definitions here -->
	<bean id="sob" class="pen">

		<property name="name">

			<value>Lux</value>

		</property>
		<property name="brand">

		<value>Tramax</value>

		</property>
		<property name="color">

		<value>blue</value>

		</property>
		<property name="price">

			<value>15</value>

		</property>
		<property name="weight">

			<value>100</value>

		</property>
		<property name="height">

			<value>2.5</value>

		</property>
		<property name="width">

			<value>2</value>

		</property>
		<property name="quality">

			<value></value>

		</property>
		<property name="performance">

			<value>2021</value>

		</property>
		<property name="type">

		<value>Plastic</value>

		</property>
		<property name="mobileno">

		<value>0234589</value>

		</property>

	</bean>

</beans>
__________________________________________________________________________________________

Class 21:
	class cloth{
	int price;
	String color,brand,discount,type,weight,quality,fabric,pattern,address;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "cloth [price=" + price + ", color=" + color + ", brand=" + brand + ", discount=" + discount + ", type="
				+ type + ", weight=" + weight + ", quality=" + quality + ", fabric=" + fabric + ", pattern=" + pattern
				+ ", address=" + address + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="cloth">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="color">

			<value>Black</value>

			</property>

			</property>
			<property name="brand">

			<value>Sparx</value>

			</property>
			<property name="discount">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="type">

				<value>Sport</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="fabric">

				<value>Cloth</value>

			</property>
			<property name="pattern">

				<value>Stylish</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

		

		</bean>

	</beans>
__________________________________________________________________________________________

Class 22:
		class Table{
			int price;
			String height,compamy,material,weight,size,capacity,color,type,address;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getHeight() {
				return height;
			}
			public void setHeight(String height) {
				this.height = height;
			}
			public String getCompamy() {
				return compamy;
			}
			public void setCompamy(String compamy) {
				this.compamy = compamy;
			}
			public String getMaterial() {
				return material;
			}
			public void setMaterial(String material) {
				this.material = material;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getSize() {
				return size;
			}
			public void setSize(String size) {
				this.size = size;
			}
			public String getCapacity() {
				return capacity;
			}
			public void setCapacity(String capacity) {
				this.capacity = capacity;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			@Override
			public String toString() {
				return "Table [price=" + price + ", height=" + height + ", compamy=" + compamy + ", material="
						+ material + ", weight=" + weight + ", size=" + size + ", capacity=" + capacity + ", color="
						+ color + ", type=" + type + ", address=" + address + "]";
			}
			
		}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Table">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="height">

			<value>10</value>

			</property>
			<property name="company">

			<value>Jagwr</value>

			</property>
			<property name="material">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="size">

				<value>5</value>

			</property>
			<property name="capacity">

				<value>5</value>

			</property>
			<property name="color">

				<value>Black</value>

			</property>
			<property name="type">

				<value>Mix</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

		

		</bean>

	</beans>
	
	
__________________________________________________________________________________________

Class 23:
	class socity{
	int id;
	String name;
	int edu;
	int age,pincode;
	String address,word,salary,dist;
	double phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdu() {
		return edu;
	}
	public void setEdu(int edu) {
		this.edu = edu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWord() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "socity [id=" + id + ", name=" + name + ", edu=" + edu + ", age=" + age + ", pincode=" + pincode
				+ ", address=" + address + ", word=" + word + ", salary=" + salary + ", dist=" + dist + ", phone="
				+ phone + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="socity">

			<property name="name">

				<value>Sachin</value>

			</property>
			<property name="id">

			<value>10</value>

			</property>
			<property name="edu">

			<value>BE</value>

			</property>
			<property name="age">

				<value>21</value>

			</property>
			<property name="pincode">

				<value>411014</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

			</property>
			<property name="cource">

				<value>JAVA</value>

			</property>
			<property name="salary">

				<value>20000</value>

			</property>
			<property name="dist">

				<value>Pune</value>

			</property>
			<property name="phone">

				<value>7972897599</value>

		

		</bean>

	</beans>
__________________________________________________________________________________________

		
Class 24:
		class Dress{
			int price;
			String color,brand,discount,type,weight,quality,fabric,pattern,address;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getDiscount() {
				return discount;
			}
			public void setDiscount(String discount) {
				this.discount = discount;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getQuality() {
				return quality;
			}
			public void setQuality(String quality) {
				this.quality = quality;
			}
			public String getFabric() {
				return fabric;
			}
			public void setFabric(String fabric) {
				this.fabric = fabric;
			}
			public String getPattern() {
				return pattern;
			}
			public void setPattern(String pattern) {
				this.pattern = pattern;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			@Override
			public String toString() {
				return "Dress [price=" + price + ", color=" + color + ", brand=" + brand + ", discount=" + discount
						+ ", type=" + type + ", weight=" + weight + ", quality=" + quality + ", fabric=" + fabric
						+ ", pattern=" + pattern + ", address=" + address + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Dress">

			<property name="price">

				<value>2000</value>

			</property>
			<property name="color">

			<value>Black</value>

			</property>

			</property>
			<property name="brand">

			<value>Sparx</value>

			</property>
			<property name="discount">

				<value>stel</value>

			</property>
			<property name="wieght">

				<value>41</value>

			</property>
			<property name="type">

				<value>Sport</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
			<property name="fabric">

				<value>Cloth</value>

			</property>
			<property name="pattern">

				<value>Stylish</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>
				</property>
		

		</bean>

	</beans>

__________________________________________________________________________________________

Class 25:
		class Dam{
			
			String name,city,state,dist,height,capacity,area,power,generation,flood,control,address;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getDist() {
				return dist;
			}

			public void setDist(String dist) {
				this.dist = dist;
			}

			public String getHeight() {
				return height;
			}

			public void setHeight(String height) {
				this.height = height;
			}

			public String getCapacity() {
				return capacity;
			}

			public void setCapacity(String capacity) {
				this.capacity = capacity;
			}

			public String getArea() {
				return area;
			}

			public void setArea(String area) {
				this.area = area;
			}

			public String getPower() {
				return power;
			}

			public void setPower(String power) {
				this.power = power;
			}

			public String getGeneration() {
				return generation;
			}

			public void setGeneration(String generation) {
				this.generation = generation;
			}

			public String getFlood() {
				return flood;
			}

			public void setFlood(String flood) {
				this.flood = flood;
			}

			public String getControl() {
				return control;
			}

			public void setControl(String control) {
				this.control = control;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			@Override
			public String toString() {
				return "Dam [name=" + name + ", city=" + city + ", state=" + state + ", dist=" + dist + ", height="
						+ height + ", capacity=" + capacity + ", area=" + area + ", power=" + power + ", generation="
						+ generation + ", flood=" + flood + ", control=" + control + ", address=" + address + "]";
			}
			
			
		}
------------------------------------------------------------------------------------------
config.xml :

	<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- bean definitions here -->
	<bean id="sob" class="Dam">

		<property name="name">

			<value>Lux</value>

		</property>
		<property name="city">

		<value>Kolhapur</value>

		</property>
		<property name="dist">

		<value>Kolhapur</value>

		</property>
		<property name="price">

			<value>15</value>

		</property>
		<property name="height">

			<value>100</value>

		</property>
		<property name="area">

			<value>5</value>

		</property>
		<property name="capacity">

			<value>20000</value>

		</property>
		<property name="power">

			<value>2050</value>

		</property>
		<property name="generation">

			<value>20</value>

		</property>
		<property name="flood">

		<value>Loss</value>

		</property>
		<property name="control">

		<value>machine</value>

		</property>

		<property name="address">

		<value>VimanNagar</value>
		</property>
	</bean>

</beans>
__________________________________________________________________________________________

Class 26:
		class Cake{
			int price;
			String name,flover,taste,weight,address,garnishing,quality,mfgdate;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getFlover() {
				return flover;
			}
			public void setFlover(String flover) {
				this.flover = flover;
			}
			public String getTaste() {
				return taste;
			}
			public void setTaste(String taste) {
				this.taste = taste;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getGarnishing() {
				return garnishing;
			}
			public void setGarnishing(String garnishing) {
				this.garnishing = garnishing;
			}
			public String getQuality() {
				return quality;
			}
			public void setQuality(String quality) {
				this.quality = quality;
			}
			public String getMfgdate() {
				return mfgdate;
			}
			public void setMfgdate(String mfgdate) {
				this.mfgdate = mfgdate;
			}
			@Override
			public String toString() {
				return "Cake [price=" + price + ", name=" + name + ", flover=" + flover + ", taste=" + taste
						+ ", weight=" + weight + ", address=" + address + ", garnishing=" + garnishing + ", quality="
						+ quality + ", mfgdate=" + mfgdate + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Cake">

			<property name="price">

				<value>200</value>

			</property>
			<property name="flover">

			<value>Rose</value>

			</property>
			<property name="taste">

			<value>sweet</value>

			</property>
			<property name="brand">

				<value>LUX</value>

			</property>
			<property name="garnishing">

				<value>SHOTELS</value>

			</property>

			<property name="mfgdate">

				<value>2021</value>

			</property>
			<property name="quality">

			<value>FirstClass</value>

			</property>
			
			
			<property name="name">

			<value>SCake</value>
			</property>
			<property name="address">

			<value>VimanNagar</value>
			</property>

			

		</bean>

	</beans>

__________________________________________________________________________________________

Class 27:
		class Toy{
			int price;
			String name,company,color,weight,type,size,quality,discount,address;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getCompany() {
				return company;
			}
			public void setCompany(String company) {
				this.company = company;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getSize() {
				return size;
			}
			public void setSize(String size) {
				this.size = size;
			}
			public String getQuality() {
				return quality;
			}
			public void setQuality(String quality) {
				this.quality = quality;
			}
			public String getDiscount() {
				return discount;
			}
			public void setDiscount(String discount) {
				this.discount = discount;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			@Override
			public String toString() {
				return "Toy [price=" + price + ", name=" + name + ", company=" + company + ", color=" + color
						+ ", weight=" + weight + ", type=" + type + ", size=" + size + ", quality=" + quality
						+ ", discount=" + discount + ", address=" + address + "]";
			}	
		}

------------------------------------------------------------------------------------------
config.xml :

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Toy">

			<property name="type">

				<value>SchoolBag</value>

			</property>
			<property name="company">

				<value>Skybags</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="size">

				<value>4</value>

			</property>
			<property name="quality">

				<value>First</value>

			</property>
		
			<property name="discount">

			<value>20</value>

		</property>
		

	</property>
	

</property>
			<property name="color">

				<value>Black</value>

			</property>
			<property name="address">

			<value>VimanNagar</value>
			</property>


		</bean>

	</beans
__________________________________________________________________________________________

Class 28:
		class Bag{
			int price,size;
			String color,brand,height,weight,discount,capacity,warranty,parts,type;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public int getSize() {
				return size;
			}
			public void setSize(int size) {
				this.size = size;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getHeight() {
				return height;
			}
			public void setHeight(String height) {
				this.height = height;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getDiscount() {
				return discount;
			}
			public void setDiscount(String discount) {
				this.discount = discount;
			}
			public String getCapacity() {
				return capacity;
			}
			public void setCapacity(String capacity) {
				this.capacity = capacity;
			}
			public String getWarranty() {
				return warranty;
			}
			public void setWarranty(String warranty) {
				this.warranty = warranty;
			}
			public String getParts() {
				return parts;
			}
			public void setParts(String parts) {
				this.parts = parts;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			@Override
			public String toString() {
				return "Bag [price=" + price + ", size=" + size + ", color=" + color + ", brand=" + brand + ", height="
						+ height + ", weight=" + weight + ", discount=" + discount + ", capacity=" + capacity
						+ ", warranty=" + warranty + ", parts=" + parts + ", type=" + type + "]";
			}
			
		}
------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="bag">

			<property name="type">

				<value>SchoolBag</value>

			</property>
			<property name="brand">

				<value>Skybags</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="hight">

				<value>4</value>

			</property>
			<property name="width">

				<value>2</value>

			</property>
			<property name="capacity">

				<value>2</value>

			</property>
			<property name="discount">

			<value>20</value>

		</property>
		<property name="parts">

		<value>5</value>
		

	</property>
	<property name="warranty">

	<value>5</value>
	

</property>
			<property name="color">

				<value>Black</value>

			</property>


		</bean>

	</beans>

__________________________________________________________________________________________


Class 29:
	class biscuit{
	int price;
	String name,flover,taste,weight,address,garnishing,quality,mfgdate;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlover() {
		return flover;
	}
	public void setFlover(String flover) {
		this.flover = flover;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGarnishing() {
		return garnishing;
	}
	public void setGarnishing(String garnishing) {
		this.garnishing = garnishing;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	@Override
	public String toString() {
		return "biscuit [price=" + price + ", name=" + name + ", flover=" + flover + ", taste=" + taste + ", weight="
				+ weight + ", address=" + address + ", garnishing=" + garnishing + ", quality=" + quality + ", mfgdate="
				+ mfgdate + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="biscuit">

			<property name="price">

				<value>200</value>

			</property>
			<property name="flover">

			<value>Rose</value>

			</property>
			<property name="taste">

			<value>sweet</value>

			</property>
			<property name="brand">

				<value>LUX</value>

			</property>
			<property name="garnishing">

				<value>SHOTELS</value>

			</property>

			<property name="mfgdate">

				<value>2021</value>

			</property>
			<property name="quality">

			<value>FirstClass</value>

			</property>
			
			
			<property name="name">

			<value>SCake</value>
			</property>
			<property name="address">

			<value>VimanNagar</value>
			</property>

			

		</bean>

	</beans>

__________________________________________________________________________________________

Class 30:
		class Headphone{
			int price;
			String brand,company,color,weight,height,capacity,parts,quality,type;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getCompany() {
				return company;
			}
			public void setCompany(String company) {
				this.company = company;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getHeight() {
				return height;
			}
			public void setHeight(String height) {
				this.height = height;
			}
			public String getCapacity() {
				return capacity;
			}
			public void setCapacity(String capacity) {
				this.capacity = capacity;
			}
			public String getParts() {
				return parts;
			}
			public void setParts(String parts) {
				this.parts = parts;
			}
			public String getQuality() {
				return quality;
			}
			public void setQuality(String quality) {
				this.quality = quality;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			@Override
			public String toString() {
				return "Headphone [price=" + price + ", brand=" + brand + ", company=" + company + ", color=" + color
						+ ", weight=" + weight + ", height=" + height + ", capacity=" + capacity + ", parts=" + parts
						+ ", quality=" + quality + ", type=" + type + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Headphone">

			<property name="quality">

				<value>First</value>

			</property>
			<property name="brand">

				<value>Skybags</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="height">

				<value>4</value>

			</property>
	
			<property name="capacity">

				<value>2</value>

			</property>
			<property name="discount">

			<value>20</value>

		</property>
		<property name="parts">

		<value>5</value>
		

	</property>
	<property name="company">

	<value>5</value>
	

</property>
			<property name="color">

				<value>Black</value>

			</property>
			
			<property name="type">

			<value>Electronic</value>

		</property>


		</bean>

	</beans>
__________________________________________________________________________________________

Class 31:
		class Wardrobe{
			int price;
			String company,brand,color,weight,height,capacity,parts,quality,type;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getCompany() {
				return company;
			}
			public void setCompany(String company) {
				this.company = company;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getWeight() {
				return weight;
			}
			public void setWeight(String weight) {
				this.weight = weight;
			}
			public String getHeight() {
				return height;
			}
			public void setHeight(String height) {
				this.height = height;
			}
			public String getCapacity() {
				return capacity;
			}
			public void setCapacity(String capacity) {
				this.capacity = capacity;
			}
			public String getParts() {
				return parts;
			}
			public void setParts(String parts) {
				this.parts = parts;
			}
			public String getQuality() {
				return quality;
			}
			public void setQuality(String quality) {
				this.quality = quality;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			@Override
			public String toString() {
				return "Wardrobe [price=" + price + ", company=" + company + ", brand=" + brand + ", color=" + color
						+ ", weight=" + weight + ", height=" + height + ", capacity=" + capacity + ", parts=" + parts
						+ ", quality=" + quality + ", type=" + type + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="Wardrobe">

			<property name="quality">

				<value>First</value>

			</property>
			<property name="brand">

				<value>Wooden</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="height">

				<value>4</value>

			</property>
	
			<property name="capacity">

				<value>2</value>

			</property>
			<property name="discount">

			<value>20</value>

		</property>
		<property name="parts">

		<value>5</value>
		

	</property>
	<property name="company">

	<value>5</value>
	

</property>
			<property name="color">

				<value>Black</value>

			</property>
			
			<property name="type">

			<value>Wooden</value>

		</property>


		</bean>

	</beans>

__________________________________________________________________________________________

Class 32:
		class AC{
			int price;
			String brand,power,efficiency,warranty,cooling_capacity,remote_control,timers,filter,quality;
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getPower() {
				return power;
			}
			public void setPower(String power) {
				this.power = power;
			}
			public String getEfficiency() {
				return efficiency;
			}
			public void setEfficiency(String efficiency) {
				this.efficiency = efficiency;
			}
			public String getWarranty() {
				return warranty;
			}
			public void setWarranty(String warranty) {
				this.warranty = warranty;
			}
			public String getCooling_capacity() {
				return cooling_capacity;
			}
			public void setCooling_capacity(String cooling_capacity) {
				this.cooling_capacity = cooling_capacity;
			}
			public String getRemote_control() {
				return remote_control;
			}
			public void setRemote_control(String remote_control) {
				this.remote_control = remote_control;
			}
			public String getTimers() {
				return timers;
			}
			public void setTimers(String timers) {
				this.timers = timers;
			}
			public String getFilter() {
				return filter;
			}
			public void setFilter(String filter) {
				this.filter = filter;
			}
			public String getQuality() {
				return quality;
			}
			public void setQuality(String quality) {
				this.quality = quality;
			}
			@Override
			public String toString() {
				return "AC [price=" + price + ", brand=" + brand + ", power=" + power + ", efficiency=" + efficiency
						+ ", warranty=" + warranty + ", cooling_capacity=" + cooling_capacity + ", remote_control="
						+ remote_control + ", timers=" + timers + ", filter=" + filter + ", quality=" + quality + "]";
			}
			
		}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- bean definitions here -->
	<bean id="sob" class="AC">

		<property name="price">

			<value>20000</value>

		</property>
		<property name="brand">

		<value>Apple</value>

		</property>
		<property name="dist">

		<value>Kolhapur</value>

		</property>
		<property name="price">

			<value>15</value>

		</property>
		<property name="power">

		<value>2050</value>

	</property>
		<property name="effeciency">

			<value>Larg</value>

		</property>
		<property name="cooling_capacity">

			<value>20000</value>

		</property>
		
		<property name="warranty">

			<value>5</value>

		</property>
	
		<property name="remote_control">

		<value>machine</value>

		</property>

		<property name="timer">

		<value>5</value>
		</property>
		<property name="filter">

		<value>Best</value>
		</property>
		<property name="quality">

		<value>Heigh</value>
		</property>
	</bean>

</beans>
__________________________________________________________________________________________

Class 33:
		class bike{
			String color,price,dist;
			int edu,height,speed;
			int age,pincode;
			String address;
			double mobileno;
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getPrice() {
				return price;
			}
			public void setPrice(String price) {
				this.price = price;
			}
			public String getDist() {
				return dist;
			}
			public void setDist(String dist) {
				this.dist = dist;
			}
			public int getEdu() {
				return edu;
			}
			public void setEdu(int edu) {
				this.edu = edu;
			}
			public int getHeight() {
				return height;
			}
			public void setHeight(int height) {
				this.height = height;
			}
			public int getSpeed() {
				return speed;
			}
			public void setSpeed(int speed) {
				this.speed = speed;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public double getMobileno() {
				return mobileno;
			}
			public void setMobileno(double mobileno) {
				this.mobileno = mobileno;
			}
			@Override
			public String toString() {
				return "bike [color=" + color + ", price=" + price + ", dist=" + dist + ", edu=" + edu + ", height="
						+ height + ", speed=" + speed + ", age=" + age + ", pincode=" + pincode + ", address=" + address
						+ ", mobileno=" + mobileno + "]";
			}
			
				
		}
------------------------------------------------------------------------------------------
config.xml :

	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="bike">

			<property name="color">

				<value>Black</value>

			</property>
			<property name="price">

			<value>10000</value>

			</property>
			<property name="edu">

			<value>BE</value>

			</property>
			<property name="age">

				<value>21</value>

			</property>
			<property name="pincode">

				<value>411014</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

			</property>
			<property name="speed">

				<value>120</value>

			</property>
			<property name="height">

				<value>4</value>

			</property>
			<property name="dist">

				<value>Pune</value>

			</property>
			<property name="mobileno">

				<value>7972897599</value>
				</property>

		

		</bean>

	</beans>
__________________________________________________________________________________________

Class 34:
	class fan{
	int price;
	String company,brand,color,weight,height,capacity,parts,quality,type;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getParts() {
		return parts;
	}
	public void setParts(String parts) {
		this.parts = parts;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "fan [price=" + price + ", company=" + company + ", brand=" + brand + ", color=" + color + ", weight="
				+ weight + ", height=" + height + ", capacity=" + capacity + ", parts=" + parts + ", quality=" + quality
				+ ", type=" + type + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :
	
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="fan">

			<property name="type">

				<value>Iron</value>

			</property>
			<property name="brand">

				<value>Skybags</value>

			</property>
			<property name="price">

				<value>1500</value>

			</property>
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="hight">

				<value>4</value>

			</property>
			<property name="width">

				<value>2</value>

			</property>
			<property name="capacity">

				<value>2</value>

			</property>
			<property name="discount">

			<value>20</value>

		</property>
		<property name="parts">

		<value>5</value>
		

	</property>
	<property name="warranty">

	<value>5</value>
	

</property>
			<property name="color">

				<value>Black</value>

			</property>


		</bean>

	</beans>
__________________________________________________________________________________________

Class 35:
		class Tv{
			String price,color;
			int height,capacity;
			int weight,validity,generation;
			String version,address;
			double mobileno;
			public String getPrice() {
				return price;
			}
			public void setPrice(String price) {
				this.price = price;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public int getHeight() {
				return height;
			}
			public void setHeight(int height) {
				this.height = height;
			}
			public int getCapacity() {
				return capacity;
			}
			public void setCapacity(int capacity) {
				this.capacity = capacity;
			}
			public int getWeight() {
				return weight;
			}
			public void setWeight(int weight) {
				this.weight = weight;
			}
			public int getValidity() {
				return validity;
			}
			public void setValidity(int validity) {
				this.validity = validity;
			}
			public int getGeneration() {
				return generation;
			}
			public void setGeneration(int generation) {
				this.generation = generation;
			}
			public String getVersion() {
				return version;
			}
			public void setVersion(String version) {
				this.version = version;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public double getMobileno() {
				return mobileno;
			}
			public void setMobileno(double mobileno) {
				this.mobileno = mobileno;
			}
			@Override
			public String toString() {
				return "Tv [price=" + price + ", color=" + color + ", height=" + height + ", capacity=" + capacity
						+ ", weight=" + weight + ", validity=" + validity + ", generation=" + generation + ", version="
						+ version + ", address=" + address + ", mobileno=" + mobileno + "]";
			}
			
		}

------------------------------------------------------------------------------------------
config.xml :
	

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="TV">

			<property name="price">

				<value>50000</value>

			</property>
		
			
			<property name="weight">

				<value>1.5</value>

			</property>
			<property name="height">

				<value>4</value>

			</property>
			
			<property name="validity">

				<value>2</value>

			</property>
			<property name="color">

				<value>Black</value>

			</property>
			<property name="generation">

			<value>11</value>

			</property>
			<property name="address">

			<value>VimanNagar</value>

		</property>
	
		<property name="mobileno">

			<value>7972897599</value>
			</property>


		</bean>

__________________________________________________________________________________________

Class 36:
		class bank{
			int id;
			String name;
			int edu;
			int age,pincode;
			String address,cource,salary,dist;
			double phone;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getEdu() {
				return edu;
			}
			public void setEdu(int edu) {
				this.edu = edu;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getCource() {
				return cource;
			}
			public void setCource(String cource) {
				this.cource = cource;
			}
			public String getSalary() {
				return salary;
			}
			public void setSalary(String salary) {
				this.salary = salary;
			}
			public String getDist() {
				return dist;
			}
			public void setDist(String dist) {
				this.dist = dist;
			}
			public double getPhone() {
				return phone;
			}
			public void setPhone(double phone) {
				this.phone = phone;
			}
			@Override
			public String toString() {
				return "bank [id=" + id + ", name=" + name + ", edu=" + edu + ", age=" + age + ", pincode=" + pincode
						+ ", address=" + address + ", cource=" + cource + ", salary=" + salary + ", dist=" + dist
						+ ", phone=" + phone + "]";
			}
			 
		}

------------------------------------------------------------------------------------------
config.xml :

	<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- bean definitions here -->
	<bean id="sob" class="newsim">

		<property name="id">

			<value>10</value>

		</property>
		<property name="name">

		<value>Sachin</value>

		</property>
		<property name="edu">

		<value>BE</value>

		</property>
		<property name="age">

			<value>21</value>

		</property>
		<property name="pincode">

			<value>411014</value>

		</property>
		<property name="address">

			<value>VimanNagar</value>

		</property>
		<property name="cource">

			<value>JAVA</value>

		</property>
		<property name="height">

			<value>4</value>

		</property>
		<property name="dist">

			<value>Pune</value>

		</property>
		<property name="phone">

			<value>7972897599</value>

	

	</bean>

</beans>
__________________________________________________________________________________________

Class 37:
	class newsim{
	int id;
	String name;
	int edu;
	int age,pincode;
	String address,cource,salary,dist;
	double phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdu() {
		return edu;
	}
	public void setEdu(int edu) {
		this.edu = edu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "newsim [id=" + id + ", name=" + name + ", edu=" + edu + ", age=" + age + ", pincode=" + pincode
				+ ", address=" + address + ", cource=" + cource + ", salary=" + salary + ", dist=" + dist + ", phone="
				+ phone + "]";
	}	
	
}
------------------------------------------------------------------------------------------
config.xml :
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

		<!-- bean definitions here -->
		<bean id="sob" class="newsim">

			<property name="id">

				<value>10</value>

			</property>
			<property name="name">

			<value>Sachin</value>

			</property>
			<property name="edu">

			<value>BE</value>

			</property>
			<property name="age">

				<value>21</value>

			</property>
			<property name="pincode">

				<value>411014</value>

			</property>
			<property name="address">

				<value>VimanNagar</value>

			</property>
			<property name="cource">

				<value>JAVA</value>

			</property>
			<property name="height">

				<value>4</value>

			</property>
			<property name="dist">

				<value>Pune</value>

			</property>
			<property name="mobileno">

				<value>7972897599</value>

		

		</bean>

	</beans>

__________________________________________________________________________________________
		

Class 38:
class Car{
	String color,price,brand;
	int height,speed;
	int capacity,weight,pincode;
	String address;
	double mobileno;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", brand=" + brand + ", height=" + height
				+ ", speed=" + speed + ", capacity=" + capacity + ", weight=" + weight + ", pincode=" + pincode
				+ ", address=" + address + ", mobileno=" + mobileno + "]";
	}
	
}

------------------------------------------------------------------------------------------
config.xml :
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="Car">

<property name="color">

	<value>blue</value>

</property>
<property name="price">

<value>550000</value>

</property>
<property name="brand">

<value>alto</value>

</property>
<property name="height">

<value>5</value>

</property>
<property name="weight">

<value>11</value>

</property>
<property name="speed">

<value>60</value>

</property>
<property name="capacity">

<value>6</value>

</property>
<property name="pincode">

	<value>411014</value>

</property>
<property name="mobileno">

	<value>7721842203</value>

</property>

<property name="address">

	<value>pune</value>

</property>
</bean>
</beans>
______________________________________________________________________________________________

Class 39:
class Mobile{
	String color,price,brand;
	int height,ram,rom;
	int weight,pincode,version;
	String address;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Mobile [color=" + color + ", price=" + price + ", brand=" + brand + ", height=" + height
				+ ", ram=" + ram + ", rom=" + rom + ", weight=" + weight + ", pincode=" + pincode + ", version="
				+ version + ", address=" + address + "]";
	}
	
}

------------------------------------------------------------------------------------------
config.xml :
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="Mobile">

<property name="color">

	<value>blue</value>

</property>
<property name="price">

<value>15000</value>

</property>
<property name="brand">

<value>samsung</value>

</property>
<property name="height">

<value>11</value>

</property>
<property name="weight">

<value>11</value>

</property>
<property name="ram">

<value>32</value>

</property>
<property name="rom">

<value>4</value>

</property>
<property name="pincode">

	<value>411014</value>

</property>
<property name="version">

	<value>8.2</value>

</property>

<property name="address">

	<value>pune</value>

</property>
</bean>
</beans>
__________________________________________________________________________________________

Class 40:
class refrigerator{
	int price ,height,weight,capacity,stars;
	String color,compnay,door,doorsize,validity;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompnay() {
		return compnay;
	}
	public void setCompnay(String compnay) {
		this.compnay = compnay;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getDoorsize() {
		return doorsize;
	}
	public void setDoorsize(String doorsize) {
		this.doorsize = doorsize;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "refrigerator [price=" + price + ", height=" + height + ", weight=" + weight + ", capacity="
				+ capacity + ", stars=" + stars + ", color=" + color + ", compnay=" + compnay + ", door=" + door
				+ ", doorsize=" + doorsize + ", validity=" + validity + "]";
	}
	
}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="refrigerator">

<property name="price">

	<value>14000</value>

</property>
<property name="height">

<value>5</value>

</property>
<property name="weight">

<value>11</value>

</property>
<property name="capacity">

<value>21</value>

</property>
<property name="stars">

<value>4</value>

</property>
<property name="color">

	<value>white</value>

</property>
<property name="compnay">

	<value>hp</value>

</property>

<property name="door">

	<value>remote</value>

</property>
<property name="doorsize">

<value>4.8</value>

</property>
<property name="validity">

<value>10</value>

</property>
			
</bean>
</beans>
___________
__________________________________________________________________________________________

Class 41:
class smartwatch{
String color,price,brand;
int height,ram,rom;
int weight,pincode,version;
String address;
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public String getPrice() {
return price;
}
public void setPrice(String price) {
this.price = price;
}
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public int getHeight() {
return height;
}
public void setHeight(int height) {
this.height = height;
}
public int getRam() {
return ram;
}
public void setRam(int ram) {
this.ram = ram;
}
public int getRom() {
return rom;
}
public void setRom(int rom) {
this.rom = rom;
}
public int getWeight() {
return weight;
}
public void setWeight(int weight) {
this.weight = weight;
}
public int getPincode() {
return pincode;
}
public void setPincode(int pincode) {
this.pincode = pincode;
}
public int getVersion() {
return version;
}
public void setVersion(int version) {
this.version = version;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
@Override
public String toString() {
return "smartwatch [color=" + color + ", price=" + price + ", brand=" + brand + ", height=" + height + ", ram="
		+ ram + ", rom=" + rom + ", weight=" + weight + ", pincode=" + pincode + ", version=" + version
		+ ", address=" + address + "]";
}

}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="smartwatch">

<property name="color">

	<value>pink</value>

</property>
<property name="price">

<value>2540</value>

</property>
<property name="brand">

<value>faststrak</value>

</property>
<property name="height">

<value>2</value>

</property>
<property name="ram">

	<value>1</value>

</property>
<property name="rom">

	<value>1</value>

</property>
<property name="weight">

	<value>0.200</value>

</property>
<property name="pincode">

	<value>411014</value>

</property>
<property name="version">

<value>5.2</value>

</property>
<property name="address">

<value>pune</value>

</property>
			
</bean>
</beans>
__________________________________________________________________________________________

Class 42:
class gift{
String color,price,brand;
int height,speed;
int capacity,weight,pincode;
String address;
double mobileno;
String type;
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public String getPrice() {
return price;
}
public void setPrice(String price) {
this.price = price;
}
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public int getHeight() {
return height;
}
public void setHeight(int height) {
this.height = height;
}
public int getSpeed() {
return speed;
}
public void setSpeed(int speed) {
this.speed = speed;
}
public int getCapacity() {
return capacity;
}
public void setCapacity(int capacity) {
this.capacity = capacity;
}
public int getWeight() {
return weight;
}
public void setWeight(int weight) {
this.weight = weight;
}
public int getPincode() {
return pincode;
}
public void setPincode(int pincode) {
this.pincode = pincode;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public double getMobileno() {
return mobileno;
}
public void setMobileno(double mobileno) {
this.mobileno = mobileno;
}
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
@Override
public String toString() {
return "gift [color=" + color + ", price=" + price + ", brand=" + brand + ", height=" + height + ", speed="
		+ speed + ", capacity=" + capacity + ", weight=" + weight + ", pincode=" + pincode + ", address="
		+ address + ", mobileno=" + mobileno + ", type=" + type + "]";
}

}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="gift">

<property name="color">

	<value>pink</value>

</property>
<property name="brand">

<value>toy</value>

</property>
<property name="height">

<value>20</value>

</property>
<property name="speed">

	<value>65</value>

</property>
<property name="capacity">

	<value>50</value>

</property>
<property name="weight">

	<value>5</value>

</property>
<property name="pincode">

	<value>411014</value>

</property>
<property name="address">

<value>pune</value>

</property>
<property name="mobileno">

<value>7721842203</value>

</property>
<property name="type">

<value>toy</value>

</property>
		
</bean>
</beans>

__________________________________________________________________________________________

Class 43:
class washingmachine{
int price;
String brand,power,efficiency,warranty,cooling_capacity,remote_control,timers,filter,quality;
public int getPrice() {
return price;
}
public void setPrice(int price) {
this.price = price;
}
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public String getPower() {
return power;
}
public void setPower(String power) {
this.power = power;
}
public String getEfficiency() {
return efficiency;
}
public void setEfficiency(String efficiency) {
this.efficiency = efficiency;
}
public String getWarranty() {
return warranty;
}
public void setWarranty(String warranty) {
this.warranty = warranty;
}
public String getCooling_capacity() {
return cooling_capacity;
}
public void setCooling_capacity(String cooling_capacity) {
this.cooling_capacity = cooling_capacity;
}
public String getRemote_control() {
return remote_control;
}
public void setRemote_control(String remote_control) {
this.remote_control = remote_control;
}
public String getTimers() {
return timers;
}
public void setTimers(String timers) {
this.timers = timers;
}
public String getFilter() {
return filter;
}
public void setFilter(String filter) {
this.filter = filter;
}
public String getQuality() {
return quality;
}
public void setQuality(String quality) {
this.quality = quality;
}
@Override
public String toString() {
return "washingmachine [price=" + price + ", brand=" + brand + ", power=" + power + ", efficiency=" + efficiency
		+ ", warranty=" + warranty + ", cooling_capacity=" + cooling_capacity + ", remote_control="
		+ remote_control + ", timers=" + timers + ", filter=" + filter + ", quality=" + quality + "]";
}

}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="washingmachine">

	<property name="price">

		<value>35000</value>

	</property>
	<property name="brand">

	<value>amezon</value>

	</property>
	<property name="power">

	<value>240</value>

	</property>
	<property name="efficiency">

		<value>20</value>

	</property>
	<property name="warranty">

		<value>5</value>

	</property>
	<property name="cooling_capacity">

		<value>21</value>

	</property>
	<property name="remote_control">

		<value>yes</value>

	</property>
	<property name="timers">

	<value>20</value>

</property>
<property name="filter">

<value>yes</value>

</property>
<property name="quality">

<value>24</value>

</property>
			
</bean>
</beans>

__________________________________________________________________________________________

Class 44:
class hitter{
int price;
String brand,power,efficiency,warranty,cooling_capacity,remote_control,timers,filter,quality;
public int getPrice() {
return price;
}
public void setPrice(int price) {
this.price = price;
}
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public String getPower() {
return power;
}
public void setPower(String power) {
this.power = power;
}
public String getEfficiency() {
return efficiency;
}
public void setEfficiency(String efficiency) {
this.efficiency = efficiency;
}
public String getWarranty() {
return warranty;
}
public void setWarranty(String warranty) {
this.warranty = warranty;
}
public String getCooling_capacity() {
return cooling_capacity;
}
public void setCooling_capacity(String cooling_capacity) {
this.cooling_capacity = cooling_capacity;
}
public String getRemote_control() {
return remote_control;
}
public void setRemote_control(String remote_control) {
this.remote_control = remote_control;
}
public String getTimers() {
return timers;
}
public void setTimers(String timers) {
this.timers = timers;
}
public String getFilter() {
return filter;
}
public void setFilter(String filter) {
this.filter = filter;
}
public String getQuality() {
return quality;
}
public void setQuality(String quality) {
this.quality = quality;
}
@Override
public String toString() {
return "hitter [price=" + price + ", brand=" + brand + ", power=" + power + ", efficiency=" + efficiency
		+ ", warranty=" + warranty + ", cooling_capacity=" + cooling_capacity + ", remote_control="
		+ remote_control + ", timers=" + timers + ", filter=" + filter + ", quality=" + quality + "]";
}

}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="hitter">

	<property name="price">

		<value>350</value>

	</property>
	<property name="brand">

	<value>amezon</value>

	</property>
	<property name="power">

	<value>240</value>

	</property>
	<property name="efficiency">

		<value>20</value>

	</property>
	<property name="warranty">

		<value>5</value>

	</property>
	<property name="cooling_capacity">

		<value>21</value>

	</property>
	<property name="remote_control">

		<value>yes</value>

	</property>
	<property name="timers">

	<value>20</value>

</property>
<property name="filter">

<value>yes</value>

</property>
<property name="quality">

<value>24</value>

</property>
			
</bean>
</beans>

__________________________________________________________________________________________

Class 45:
class plastic{
String type,brand,substance;
float price,weight,amount;
String capacity,address;
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public String getSubstance() {
return substance;
}
public void setSubstance(String substance) {
this.substance = substance;
}
public float getPrice() {
return price;
}
public void setPrice(float price) {
this.price = price;
}
public float getWeight() {
return weight;
}
public void setWeight(float weight) {
this.weight = weight;
}
public float getAmount() {
return amount;
}
public void setAmount(float amount) {
this.amount = amount;
}
public String getCapacity() {
return capacity;
}
public void setCapacity(String capacity) {
this.capacity = capacity;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
@Override
public String toString() {
return "plastic [type=" + type + ", brand=" + brand + ", substance=" + substance + ", price=" + price
		+ ", weight=" + weight + ", amount=" + amount + ", capacity=" + capacity + ", address=" + address + "]";
}


}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="plastic">

	<property name="type">

		<value>hard</value>

	</property>
	<property name="brand">

	<value>soft</value>

	</property>
	<property name="substance">

	<value>paper</value>

	</property>
	<property name="price">

		<value>210</value>

	</property>
	<property name="weight">

		<value>21</value>

	</property>
	<property name="amount">

		<value>210</value>

	</property>
	<property name="capacity">

		<value>10</value>

	</property>
	<property name="address">

	<value>pune</value>

</property>
			
</bean>
</beans>

__________________________________________________________________________________________

Class 46:
class post{
int id;
String name;
int edu;
int age,pincode;
String address,cource,salary,dist;
double phone;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getEdu() {
return edu;
}
public void setEdu(int edu) {
this.edu = edu;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public int getPincode() {
return pincode;
}
public void setPincode(int pincode) {
this.pincode = pincode;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getCource() {
return cource;
}
public void setCource(String cource) {
this.cource = cource;
}
public String getSalary() {
return salary;
}
public void setSalary(String salary) {
this.salary = salary;
}
public String getDist() {
return dist;
}
public void setDist(String dist) {
this.dist = dist;
}
public double getPhone() {
return phone;
}
public void setPhone(double phone) {
this.phone = phone;
}
@Override
public String toString() {
return "post [id=" + id + ", name=" + name + ", edu=" + edu + ", age=" + age + ", pincode=" + pincode
		+ ", address=" + address + ", cource=" + cource + ", salary=" + salary + ", dist=" + dist + ", phone="
		+ phone + "]";
}	

}
------------------------------------------------------------------------------------------
config.xml :
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="post">

	<property name="id">

		<value>101</value>

	</property>
	<property name="name">

	<value>Akash</value>

	</property>
	<property name="edu">

	<value>BE</value>

	</property>
	<property name="age">

		<value>21</value>

	</property>
	<property name="pincode">

		<value>411014</value>

	</property>
	<property name="address">

		<value>pune</value>

	</property>
	<property name="cource">

		<value>Computer</value>

	</property>
	<property name="salary">

	<value>21000</value>

</property>
<property name="dist">

<value>pune</value>

</property>
<property name="phone">

<value>7721842203</value>

</property>
	
</bean>
</beans>

__________________________________________________________________________________________

Class 47:
class oil{
String type,material,test,smell;
float price,let;
String expirydate,mfgdate,quality;
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
public String getMaterial() {
return material;
}
public void setMaterial(String material) {
this.material = material;
}
public String getTest() {
return test;
}
public void setTest(String test) {
this.test = test;
}
public String getSmell() {
return smell;
}
public void setSmell(String smell) {
this.smell = smell;
}
public float getPrice() {
return price;
}
public void setPrice(float price) {
this.price = price;
}
public float getlet() {
return let;
}
public void setlet(float let) {
this.let = let;
}
public String getExpirydate() {
return expirydate;
}
public void setExpirydate(String expirydate) {
this.expirydate = expirydate;
}
public String getMfgdate() {
return mfgdate;
}
public void setMfgdate(String mfgdate) {
this.mfgdate = mfgdate;
}
public String getQuality() {
return quality;
}
public void setQuality(String quality) {
this.quality = quality;
}
@Override
public String toString() {
return "oil [type=" + type + ", material=" + material + ", test=" + test + ", smell=" + smell + ", price="
		+ price + ", let=" + let + ", expirydate=" + expirydate + ", mfgdate=" + mfgdate + ", quality=" + quality
		+ "]";
}

}

------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="oil">

	<property name="type">

		<value>Soyabin</value>

	</property>
	<property name="material">

	<value>sunflower</value>

	</property>
	<property name="test">

	<value>oily</value>

	</property>
	<property name="smell">

		<value>good</value>

	</property>
	<property name="price">

		<value>155</value>

	</property>
	<property name="let">

		<value>10</value>

	</property>
	<property name="expirydate">

		<value>12dec2021</value>

	</property>
	<property name="mfgdate">

	<value>12jun2021</value>

</property>
<property name="quality">

<value>pure</value>

</property>
	
</bean>
</beans>

__________________________________________________________________________________________

Class 48:
class vegitable{
String type,colour;
float price,discount,kg,size;
String expirydate;
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
public String getColour() {
return colour;
}
public void setColour(String colour) {
this.colour = colour;
}
public float getPrice() {
return price;
}
public void setPrice(float price) {
this.price = price;
}
public float getDiscount() {
return discount;
}
public void setDiscount(float discount) {
this.discount = discount;
}
public float getkg() {
return kg;
}
public void setkg(float let) {
this.kg=let;
}
public float getSize() {
return size;
}
public void setSize(float size) {
this.size = size;
}
public String getExpirydate() {
return expirydate;
}
public void setExpirydate(String expirydate) {
this.expirydate = expirydate;
}
@Override
public String toString() {
return "vegitable [type=" + type + ", colour=" + colour + ", price=" + price + ", discount=" + discount
		+ ", kg=" + kg + ", size=" + size + ", expirydate=" + expirydate + "]";
}


}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="vegitable">

	<property name="type">

		<value>Palak</value>

	</property>
	<property name="colour">

	<value>green</value>

	</property>
	<property name="price">

	<value>40</value>

	</property>
	<property name="discount">

		<value>10</value>

	</property>
	<property name="kg">

		<value>5</value>

	</property>
	<property name="size">

		<value>10</value>

	</property>
	<property name="expirydate">

		<value>12dec2021</value>

	</property>
	
</bean>
</beans>

__________________________________________________________________________________________

Class 49:
class petrol{
String type,material,test,smell;
float price,let;
String avg,quality;
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
public String getMaterial() {
return material;
}
public void setMaterial(String material) {
this.material = material;
}
public String getTest() {
return test;
}
public void setTest(String test) {
this.test = test;
}
public String getSmell() {
return smell;
}
public void setSmell(String smell) {
this.smell = smell;
}
public float getPrice() {
return price;
}
public void setPrice(float price) {
this.price = price;
}
public float getlet() {
return let;
}
public void setlet(float let) {
this.let = let;
}
public String getAvg() {
return avg;
}
public void setAvg(String avg) {
this.avg = avg;
}
public String getQuality() {
return quality;
}
public void setQuality(String quality) {
this.quality = quality;
}
@Override
public String toString() {
return "petrol [type=" + type + ", material=" + material + ", test=" + test + ", smell=" + smell + ", price="
		+ price + ", let=" + let + ", avg=" + avg + ", quality=" + quality + "]";
}


}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="petrol">

	<property name="type">

		<value>IndianOil</value>

	</property>
	<property name="material">

	<value>petrol</value>

	</property>
	<property name="test">

	<value>Good</value>

	</property>
	<property name="smell">

		<value>Bhayank</value>

	</property>
	<property name="price">

		<value>107.25</value>

	</property>
	<property name="let">

		<value>10</value>

	</property>
	<property name="avg">

		<value>5.2</value>

	</property>
	<property name="quality">

		<value>5</value>

	</property>
	
</bean>
</beans>
__________________________________________________________________________________________

Class 50:
class vote{
int id,age;
String address,name,mothername ,fathername,gender,nationality,educationstatus,partyname;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getMothername() {
return mothername;
}
public void setMothername(String mothername) {
this.mothername = mothername;
}
public String getFathername() {
return fathername;
}
public void setFathername(String fathername) {
this.fathername = fathername;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getNationality() {
return nationality;
}
public void setNationality(String nationality) {
this.nationality = nationality;
}

public String getEducationstatus() {
return educationstatus;
}
public void setEducationstatus(String educationstatus) {
this.educationstatus = educationstatus;
}
public String getPartyname() {
return partyname;
}
public void setPartyname(String partyname) {
this.partyname = partyname;
}
@Override
public String toString() {
return "vote [id=" + id + ", age=" + age + ", address=" + address + ", name=" + name + ", mothername="
		+ mothername + ", fathername=" + fathername + ", gender=" + gender + ", nationality=" + nationality
		 + ", educationstatus=" + educationstatus + ", partyname=" + partyname
		+ "]";
}

}
------------------------------------------------------------------------------------------
config.xml :

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!-- bean definitions here -->
<bean id="sob" class="vote">

	<property name="id">

		<value>101</value>

	</property>
	<property name="age">

	<value>21</value>

	</property>
	<property name="address">

	<value>Pune</value>

	</property>
	<property name="name">

		<value>Akash</value>

	</property>
	<property name="mothername">

		<value>Vaishali</value>

	</property>
	<property name="fathername">

		<value>Balu</value>

	</property>
	<property name="gender">

		<value>Male</value>

	</property>
	<property name="nationality">

		<value>Indian</value>

	</property>
	<property name="educationstatus">

		<value>BE</value>

	</property>
	<property name="partyname">
		<value>NCP</value>
	</property>
</bean>
</beans>

__________________________________________________________________________________________
