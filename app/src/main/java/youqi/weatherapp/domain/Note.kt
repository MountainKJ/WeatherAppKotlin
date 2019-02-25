package youqi.weatherapp.domain

class Note{
    init {

    }

    /**
     * (param -> Unit)
     * lambda 表达式    参数的形式被定义在箭头的左边（圆括号包围）
     *                  箭头的右边返回结果值
     *                  simple:
     *                          view.setOnclickListener({view -> toast("Click")})
     *                  当我们定义了一个方法，必须使用大括号包围，然后在箭头的左边指定参数，箭头的右边返回函数执行的结果，如果左边的参数没有使用到，我们甚至可以省略左边的参数
     *                          view.setOnclickListener({toast("Click")})
     *                  如果这个函数的最后一个参数示一个函数，我们可以把这个函数移动到圆括号的外面
     *                          view.setOnclickListener(){toast("Click")}
     *                  并且，最后，如果这个函数只有一个参数，我们还可以省略圆括号：
     *                          view.setOnclickListener{toast("Click")}
     */
}