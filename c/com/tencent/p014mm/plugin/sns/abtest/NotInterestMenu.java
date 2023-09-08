package com.tencent.p014mm.plugin.sns.abtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: com.tencent.mm.plugin.sns.abtest.NotInterestMenu */
public class NotInterestMenu extends LinearLayout {

    /* renamed from: g */
    public static int[] f54208g = {C0966R.string.jd4, C0966R.string.f361374jd2, C0966R.string.f361375jd3};

    /* renamed from: d */
    public ListView f54209d;

    /* renamed from: e */
    public Context f54210e;

    /* renamed from: f */
    public SnsInfo f54211f = null;

    /* renamed from: com.tencent.mm.plugin.sns.abtest.NotInterestMenu$a */
    public class C19240a extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.sns.abtest.NotInterestMenu$a$a */
        public class C19241a {

            /* renamed from: a */
            public TextView f54213a;

            public C19241a(C19240a aVar) {
            }
        }

        public C19240a() {
        }

        public int getCount() {
            SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            int[] iArr = NotInterestMenu.f54208g;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            return 3;
        }

        public Object getItem(int i) {
            SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            int[] iArr = NotInterestMenu.f54208g;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            Integer valueOf = Integer.valueOf(NotInterestMenu.f54208g[i]);
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            return valueOf;
        }

        public long getItemId(int i) {
            SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            long j = (long) i;
            SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            return j;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            if (view == null) {
                NotInterestMenu notInterestMenu = NotInterestMenu.this;
                int[] iArr = NotInterestMenu.f54208g;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                Context context = notInterestMenu.f54210e;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                view = C85868k2.m106137b(context).inflate(C0966R.C0971layout.bl6, viewGroup, false);
                C19241a aVar = new C19241a(this);
                aVar.f54213a = (TextView) view.findViewById(C0966R.C0970id.f358865hi1);
                view.setTag(aVar);
            }
            TextView textView = ((C19241a) view.getTag()).f54213a;
            int[] iArr2 = NotInterestMenu.f54208g;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            textView.setText(NotInterestMenu.f54208g[i]);
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.abtest.NotInterestMenu$b */
    public interface C19242b {
        /* renamed from: a */
        void mo24698a();
    }

    /* renamed from: com.tencent.mm.plugin.sns.abtest.NotInterestMenu$c */
    public interface C19243c {
        /* renamed from: a */
        void mo24699a(SnsInfo snsInfo);

        /* renamed from: b */
        void mo24700b(SnsInfo snsInfo);

        /* renamed from: c */
        void mo24701c(SnsInfo snsInfo);
    }

    public NotInterestMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54210e = context;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        C85868k2.m106137b(this.f54210e).inflate(C0966R.C0971layout.bl5, this);
        ListView listView = (ListView) findViewById(C0966R.C0970id.f358864hi0);
        this.f54209d = listView;
        listView.setAdapter(new C19240a());
        this.f54209d.setOnItemClickListener(new C19244a(this));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }

    /* renamed from: a */
    public static /* synthetic */ C19243c m20385a(NotInterestMenu notInterestMenu) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        notInterestMenu.getClass();
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        return null;
    }

    public void setOnClickMenuListener(C19242b bVar) {
        SnsMethodCalculate.markStartTimeMs("setOnClickMenuListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        SnsMethodCalculate.markEndTimeMs("setOnClickMenuListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }

    public void setOnSelectMenuItemListener(C19243c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSelectMenuItemListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        SnsMethodCalculate.markEndTimeMs("setOnSelectMenuItemListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }

    public void setSnsInfo(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        this.f54211f = snsInfo;
        SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }
}
