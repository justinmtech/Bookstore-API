# Bookstore-API
A REST API for storing and fetching books, customers and orders in a database.

#Usage
All calls should be prefixed with /api/ (ie: api/customer/getCustomers)

#Books

Get Methods
Get all books -> book/getCustomers
Get specific book -> book/getBook/{bookId}
Delete specific customer -> book/deleteBook/{bookId}

Post Method
Save book -> book/saveBook (Returns book object if successful)
Example Post:
{
  "name": "Book Title",
  "author": "Good Author",
  "genre": "Book Genre"
}

#Customers

Get Methods
Get all customers -> customer/getCustomers
Get specific customer -> customer/getCustomer/{email}
Delete specific customer -> customer/deleteCustomer/{email}

Post Method
Save specific customer -> customer/saveCustomer (Returns customer object if successful)
Example Post:
{"id": "email@gmail.com"}

#Orders

Get Methods
Get all customers -> order/getOrders
Get specific customer -> order/getOrder/{orderId}
Delete specific customer -> order/deleteOrder/{orderId}

Post Method
Save order -> order/saveOrder (Returns order object if successful)
Example Post:
{
  "customer": "bob@gmail.com",
  "books":[
    {"id": 1},
    {"id": 2},
    {"id": 3}
  ]
}


