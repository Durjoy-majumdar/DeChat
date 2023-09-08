package com.tencent.p014mm.plugin.repairer.p099ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.websearch.C43471q;
import e83.C45556b;
import fy3.C32226l;
import java.util.ArrayList;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerWebSearchTemplateUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerWebSearchTemplateUI */
public final class RepairerWebSearchTemplateUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerWebSearchTemplateUI$a */
    public static final class C42879a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerWebSearchTemplateUI f116104d;

        public C42879a(RepairerWebSearchTemplateUI repairerWebSearchTemplateUI) {
            this.f116104d = repairerWebSearchTemplateUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116104d.finish();
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bt6;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setBackBtn(new C42879a(this));
        TextView textView = (TextView) findViewById(C0966R.C0970id.f358897hq2);
        if (textView != null) {
            int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 12; i++) {
                int i2 = iArr[i];
                C45556b g = C43471q.m46983g(i2);
                int e = g.mo71057e();
                int p0 = g.mo71078p0();
                StringBuilder sb = new StringBuilder();
                sb.append("type:");
                sb.append(i2);
                sb.append(" name:");
                switch (i2) {
                    case 0:
                        str = "搜一搜";
                        break;
                    case 1:
                        str = "看一看";
                        break;
                    case 2:
                        str = "航班号";
                        break;
                    case 3:
                        str = "小程序搜索";
                        break;
                    case 4:
                        str = "扫物";
                        break;
                    case 5:
                        str = "Pardus";
                        break;
                    case 6:
                        str = "Tag搜索";
                        break;
                    case 7:
                        str = "微信素材";
                        break;
                    case 8:
                        str = "图像识别";
                        break;
                    case 9:
                        str = "每日一看";
                        break;
                    case 10:
                        str = "表情搜索";
                        break;
                    case 11:
                        str = "选词填入";
                        break;
                    default:
                        str = "未知";
                        break;
                }
                sb.append(str);
                sb.append(" assertVersion:");
                sb.append(e);
                sb.append(" currentVersion:");
                sb.append(p0);
                arrayList.add(sb.toString());
            }
            textView.setText(C110818d0.m150921S(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        }
    }
}
