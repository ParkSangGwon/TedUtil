#Util class list
* ObjectUtils
* JsonUtils



##ObjectUtils

If you want check object(`String, List, Map`)is empty or not, you can use this util.


```javascript
if(ObjectUtils.isEmpty(aa)){
// Object is empty.
// do somthing
}
else{
// Object is not empty.
// do somthing
}
```

For korean [블로그 내용보기](http://gun0912.tistory.com/1)




##JsonUtils

you can convert `String` to `Json` / `Json` to `String`

you can override `toString()` function in class file. 
when you print class instance, class will print json format
```javascript

	@Override
	public String toString() {
		return JsonUtils.toJson(this);
	}


```
