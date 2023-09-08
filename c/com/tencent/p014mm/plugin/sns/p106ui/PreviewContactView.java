package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.sns.ui.PreviewContactView */
public class PreviewContactView extends LinearLayout {

    /* renamed from: d */
    public final Context f21168d;

    /* renamed from: e */
    public TableLayout f21169e;

    /* renamed from: f */
    public List<String> f21170f = new ArrayList();

    /* renamed from: g */
    public final Map<Integer, View> f21171g = new HashMap();

    /* renamed from: h */
    public final Map<Integer, TableRow> f21172h = new HashMap();

    /* renamed from: i */
    public int f21173i = 5;

    /* renamed from: j */
    public boolean f21174j = false;

    /* renamed from: com.tencent.mm.plugin.sns.ui.PreviewContactView$a */
    public static abstract class C5442a {
    }

    public PreviewContactView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21168d = context;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        this.f21169e = (TableLayout) LayoutInflater.from(context).inflate(C0966R.C0971layout.f360011c40, this, true).findViewById(C0966R.C0970id.br8);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    private TextView getEllipsizeTV() {
        SnsMethodCalculate.markStartTimeMs("getEllipsizeTV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        TextView textView = new TextView(this.f21168d);
        TextView textView2 = (TextView) getRootView().findViewById(C0966R.C0970id.f6167z7);
        if (textView2 != null) {
            textView.setTextSize(0, textView2.getTextSize());
        }
        textView.setText("...");
        textView.setTextColor(getResources().getColor(C0966R.color.f3536x0));
        SnsMethodCalculate.markEndTimeMs("getEllipsizeTV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        return textView;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f21174j) {
            setList(this.f21170f);
            this.f21174j = true;
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    public void setImageClick(C5442a aVar) {
        SnsMethodCalculate.markStartTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        SnsMethodCalculate.markEndTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    public void setLineNum(int i) {
        SnsMethodCalculate.markStartTimeMs("setLineNum", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        this.f21173i = i;
        setList(this.f21170f);
        SnsMethodCalculate.markEndTimeMs("setLineNum", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    public void setList(List<String> list) {
        int i;
        List<String> list2 = list;
        SnsMethodCalculate.markStartTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        if (list2 == null) {
            SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            return;
        }
        this.f21170f = list2;
        if (this.f21169e.getChildCount() > 0) {
            this.f21169e.removeAllViews();
        }
        if (list.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            return;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (i2 < size) {
            SnsMethodCalculate.markStartTimeMs("getRow", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            TableRow tableRow = (TableRow) ((HashMap) this.f21172h).get(Integer.valueOf(i3));
            if (tableRow == null) {
                tableRow = new TableRow(this.f21168d);
                ((HashMap) this.f21172h).put(Integer.valueOf(i3), tableRow);
            }
            SnsMethodCalculate.markEndTimeMs("getRow", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            tableRow.removeAllViews();
            int i5 = 0;
            while (i5 < this.f21173i && i2 < size) {
                SnsMethodCalculate.markStartTimeMs("getIV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                View view = (View) ((HashMap) this.f21171g).get(Integer.valueOf(i2));
                if (view == null) {
                    view = View.inflate(this.f21168d, C0966R.C0971layout.c3z, (ViewGroup) null);
                    ((HashMap) this.f21171g).put(Integer.valueOf(i2), view);
                }
                SnsMethodCalculate.markEndTimeMs("getIV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.fc8);
                imageView.setBackgroundDrawable((Drawable) null);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, list2.get(i2));
                view.setTag(0);
                view.setClickable(false);
                if (i4 == -1) {
                    SnsMethodCalculate.markStartTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                    if (view.getWidth() == 0) {
                        SnsMethodCalculate.markEndTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        i = -1;
                    } else {
                        this.f21174j = true;
                        TextView ellipsizeTV = getEllipsizeTV();
                        SnsMethodCalculate.markStartTimeMs("endTextWidth", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        Rect rect = new Rect();
                        ellipsizeTV.getPaint().getTextBounds("...", 0, 3, rect);
                        int width = rect.width();
                        SnsMethodCalculate.markEndTimeMs("endTextWidth", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        i = getWidth() / view.getWidth();
                        if (i == 5) {
                            SnsMethodCalculate.markEndTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        } else {
                            if ((getWidth() - (view.getWidth() * i)) - width < 0) {
                                i--;
                            }
                            SnsMethodCalculate.markEndTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        }
                    }
                    i4 = i;
                }
                if (i5 == i4) {
                    tableRow.addView(getEllipsizeTV());
                    i2 = size;
                } else {
                    tableRow.addView(view);
                }
                i5++;
                i2++;
                list2 = list;
            }
            this.f21169e.addView(tableRow);
            i3++;
            list2 = list;
        }
        SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }
}
