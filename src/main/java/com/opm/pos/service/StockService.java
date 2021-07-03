/*  
Copyright (C) 2021  Open Source Mexico

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/


package com.opm.pos.service;

import java.sql.SQLException;
import java.util.List;

import com.opm.pos.models.Sale;
import com.opm.pos.models.Transaction;

public interface StockService {

	public String createTransaction(Transaction transaction) throws SQLException ;
	public void createDetails(List<Sale> sales, String folio) throws SQLException ;
	public void updateStock(String serie, int count) throws SQLException;
}
