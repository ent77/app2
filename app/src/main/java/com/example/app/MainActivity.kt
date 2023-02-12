package com.example.app

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        imageButton4.setOnClickListener{
            val intent=Intent(this,diet::class.java)
            startActivity(intent)
        }
        detail2.setOnClickListener {
            val intent=Intent(this,myplan::class.java)
            startActivity(intent)
        }

        val dbHelper = Dietplan(this, "food.db", 1)
        dbHelper.writableDatabase
        val values1 = ContentValues().apply {

            put("foodName", "<熟>鸡蛋")
            put("foodperEnergy", 280)
            put("foodIntruduction", "鸡蛋含有丰富的蛋白质、脂肪、维生素和铁、钙、钾等人体所需要的矿物质,蛋白质为优质蛋白,对肝脏组织损伤有修复作用")

        }
        val values2 = ContentValues().apply {

            put("foodName", "红薯")
            put("foodperEnergy", 140)
            put("foodIntruduction", "红薯是营养丰富的天然滋补食品，其中含有蛋白质，脂肪，各类维生素，8种氨基酸，是营养价值较高的优质食物。")

        }
        val exe1 = ContentValues().apply {

            put("Name", "卷腹")
            put("Aim1","仰卧起坐")
            put("Aim2","1000米")
            put("Aim3","立定跳远")
            put("introduction", "平躺在瑜伽垫上，屈膝，双腿分开与肩同宽，双脚踩实。\n" +
                    "动作要领\n" +
                    "双手扶于两耳旁，用腹肌的力量将肩部和上背部卷离地面，在最高点略作停顿后，缓慢回到起始位置。\n" +
                    "常见错误\n" +
                    "卷腹时，下背部保持紧贴地面，手肘保持向外打开")
            put("Body","背部")
            put("Body2","胸部")
            put("Body3","全身")
            put("IsNeed","yes")
            put("Time",180)
            put("Severity","弱")

        }
        val exe2 = ContentValues().apply {

            put("Name", "标准俯卧撑")
            put("Aim1","引体向上")
            put("Aim2","1000米")
            put("Aim3","立定跳远")
            put("introduction",    "1.两手支撑在地上或支架上，两手间距比肩膀稍宽些，全臂伸直，两肩和胸略向前，使肩关节的垂直线与地面呈10度～15度角，两腿并拢，以脚趾点地支撑。躯干保持挺胸收紧腰。"

           )
            put("Body","手臂")
            put("Body2","胸部")
            put("Body3","肩部")
            put("IsNeed","no")
            put("Time",60)
            put("Severity","强")

        }

        val db = dbHelper.writableDatabase
//        db.insert("food", null, values1)
//        db.insert("food", null, values2)
//        db.insert("Exercise", null, exe1)
//        db.insert("Exercise", null, exe2)
        button14.setOnClickListener {
            val  intent=Intent(this,foodrecord::class.java)
            startActivity(intent)
        }

    }

}