package net.amigocraft.pore.implementation.inventory.meta;

import org.apache.commons.lang.NotImplementedException;
import org.bukkit.inventory.meta.BookMeta;

import java.util.List;

// TODO: bridge

// TODO: bridge

public class PoreBookMeta extends PoreItemMeta implements BookMeta {

	@Override
	public boolean hasTitle() {
		return false;
	}

	@Override
	public String getTitle() {
		throw new NotImplementedException();
	}

	@Override
	public boolean setTitle(String title) {
		return false;
	}

	@Override
	public boolean hasAuthor() {
		return false;
	}

	@Override
	public String getAuthor() {
		throw new NotImplementedException();
	}

	@Override
	public void setAuthor(String author) {
		throw new NotImplementedException();
	}

	@Override
	public boolean hasPages() {
		return false;
	}

	@Override
	public String getPage(int page) {
		throw new NotImplementedException();
	}

	@Override
	public void setPage(int page, String data) {
		throw new NotImplementedException();
	}

	@Override
	public List<String> getPages() {
		throw new NotImplementedException();
	}

	@Override
	public void setPages(List<String> pages) {
		throw new NotImplementedException();
	}

	@Override
	public void setPages(String... pages) {
		throw new NotImplementedException();
	}

	@Override
	public void addPage(String... pages) {
		throw new NotImplementedException();
	}

	@Override
	public int getPageCount() {
		return 0;
	}

	@Override
	public BookMeta clone() {
		throw new NotImplementedException();
	}
}
