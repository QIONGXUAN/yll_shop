// 加载购物车

$(function (){

});

// 创建购物车模板
function create_template(cart) {
   return '<div class="cartBox"><div class="shop_info"><div class="all_check">' +
       '<input type="checkbox" id="shop_'+cart.cartId+'" class="shopChoice">' +
       '<label for="shop_'+cart.cartId+'" class="shop"></label></div>' +
       '<div class="shop_name">店铺：<a href="javascript:;">##</a></div></div>' +
       '<div class="order_content"><ul class="order_lists"><li class="list_chk">' +
       '<input type="checkbox" id="checkbox_'+cart.cartId+'" class="son_check">' +
       '<label for="checkbox_'+cart.cartId+'"></label></li>' +
       '<li class="list_con"><div class="list_img"><a href="javascript:;">' +
       '<img src="'+cart.shop.img+'" alt=""></a></div>' +
       '<div class="list_text"><a href="javascript:;">'+cart.shop.name+'</a></div></li>' +
       '<li class="list_info"><p>规格：默认</p><p>尺寸：16*16*3(cm)</p></li>' +
       '<li class="list_price"><p class="price">￥'+cart.shop.price+'</p></li>' +
       '<li class="list_amount">' +
       '<div class="amount_box" cart_id="'+cart.cartId+'">' +
       '<a href="javascript:;" class="reduce reSty">-</a>' +
       '<input type="text" value="'+cart.num+'" class="sum">' +
       '<a href="javascript:;" class="plus">+</a></div></li>' +
       '<li class="list_sum"><p class="sum_price">￥'+cart.num*cart.shop.price+'</p></li>' +
       '<li class="list_op"><p class="del"><a href="javascript:;" class="delBtn">移除商品</a></p></li></ul></div></div>';
}