package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class File extends Stationery {

	private int numberOfPages;

	public File(String name, int price, int numberOfPages) {
		super(name,price);
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) return true;
		if (!(o instanceof File)) return false;

		File file = (File) o;

		if (getPrice() != file.getPrice()) return false;
		return getName().equals(file.getName());
	}

	@Override
	public int hashCode() {
		int result = getName().hashCode();
		result = 31 * result + getPrice();
		return result;
	}
}
