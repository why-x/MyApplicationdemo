package com.example.edz.myapplication.chart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;

import com.example.edz.myapplication.R;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {
//    PieChart mPieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);


//        //饼状图
//        mPieChart = (PieChart) findViewById(R.id.mPieChart);
//        mPieChart.setUsePercentValues(true);
//        mPieChart.getDescription().setEnabled(false);
//        mPieChart.setExtraOffsets(5, 10, 5, 5);
//
//        mPieChart.setDragDecelerationFrictionCoef(0.95f);
//        //设置中间文件
//        mPieChart.setCenterText(generateCenterSpannableText());
//
//        mPieChart.setDrawHoleEnabled(true);
//        mPieChart.setHoleColor(Color.WHITE);
//
//        mPieChart.setTransparentCircleColor(Color.WHITE);
//        mPieChart.setTransparentCircleAlpha(110);
//
//        mPieChart.setHoleRadius(58f);
//        mPieChart.setTransparentCircleRadius(61f);
//
//        mPieChart.setDrawCenterText(true);
//
//        mPieChart.setRotationAngle(0);
//        // 触摸旋转
//        mPieChart.setRotationEnabled(true);
//        mPieChart.setHighlightPerTapEnabled(true);
//
//        //变化监听
//        mPieChart.setOnChartValueSelectedListener(this);
//        //模拟数据
//        ArrayList<PieEntry> entries = new ArrayList<PieEntry>();
//        entries.add(new PieEntry(40, "优秀"));
//        entries.add(new PieEntry(20, "满分"));
//        entries.add(new PieEntry(30, "及格"));
//        entries.add(new PieEntry(10, "不及格"));
//
//        //设置数据
//        setData(entries);
//
//        mPieChart.animateY(1400, Easing.EaseInOutQuad);
//
//        Legend l = mPieChart.getLegend();
//        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
//        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
//        l.setOrientation(Legend.LegendOrientation.VERTICAL);
//        l.setDrawInside(false);
//        l.setXEntrySpace(7f);
//        l.setYEntrySpace(0f);
//        l.setYOffset(0f);
//
//        // 输入标签样式
//        mPieChart.setEntryLabelColor(Color.WHITE);
//        mPieChart.setEntryLabelTextSize(12f);

    }
    //设置中间文字
//    private SpannableString generateCenterSpannableText() {
//        //原文：MPAndroidChart\ndeveloped by Philipp Jahoda
//        SpannableString s = new SpannableString("刘某人程序员\n我仿佛听到有人说我帅");
//        //s.setSpan(new RelativeSizeSpan(1.7f), 0, 14, 0);
//        //s.setSpan(new StyleSpan(Typeface.NORMAL), 14, s.length() - 15, 0);
//        // s.setSpan(new ForegroundColorSpan(Color.GRAY), 14, s.length() - 15, 0);
//        //s.setSpan(new RelativeSizeSpan(.8f), 14, s.length() - 15, 0);
//        // s.setSpan(new StyleSpan(Typeface.ITALIC), s.length() - 14, s.length(), 0);
//        // s.setSpan(new ForegroundColorSpan(ColorTemplate.getHoloBlue()), s.length() - 14, s.length(), 0);
//        return s;
//    }
//    //设置数据
//    private void setData(ArrayList<PieEntry> entries) {
//        PieDataSet dataSet = new PieDataSet(entries, "三年级一班");
//        dataSet.setSliceSpace(3f);
//        dataSet.setSelectionShift(5f);
//
//        //数据和颜色
//        ArrayList<Integer> colors = new ArrayList<Integer>();
//        for (int c : ColorTemplate.VORDIPLOM_COLORS)
//            colors.add(c);
//        for (int c : ColorTemplate.JOYFUL_COLORS)
//            colors.add(c);
//        for (int c : ColorTemplate.COLORFUL_COLORS)
//            colors.add(c);
//        for (int c : ColorTemplate.LIBERTY_COLORS)
//            colors.add(c);
//        for (int c : ColorTemplate.PASTEL_COLORS)
//            colors.add(c);
//        colors.add(ColorTemplate.getHoloBlue());
//        dataSet.setColors(colors);
//        PieData data = new PieData(dataSet);
//        data.setValueFormatter(new PercentFormatter());
//        data.setValueTextSize(11f);
//        data.setValueTextColor(Color.WHITE);
//        mPieChart.setData(data);
//        mPieChart.highlightValues(null);
//        //刷新
//        mPieChart.invalidate();
//    }
//
//    @Override
//    public void onValueSelected(Entry e, Highlight h) {
//
//    }
//
//    @Override
//    public void onNothingSelected() {
//
//    }
}
