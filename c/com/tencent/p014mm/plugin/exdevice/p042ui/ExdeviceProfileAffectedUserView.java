package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.base.MMHorList;
import com.tencent.p014mm.plugin.exdevice.model.C2245w;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31519v2;
import java.util.ArrayList;
import kg3.C76577a;
import p196ln.C10581n;
import p196ln.C76705f;
import p196ln.C76706g;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView */
public class ExdeviceProfileAffectedUserView extends LinearLayout {

    /* renamed from: d */
    public String f12321d;

    /* renamed from: e */
    public TextView f12322e;

    /* renamed from: f */
    public MMHorList f12323f;

    /* renamed from: g */
    public C2249a f12324g;

    /* renamed from: h */
    public ArrayList<String> f12325h;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView$a */
    public class C2249a extends BaseAdapter {

        /* renamed from: d */
        public Runnable f12326d = new C2250a();

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView$a$a */
        public class C2250a implements Runnable {
            public C2250a() {
            }

            public void run() {
                C2249a.this.notifyDataSetChanged();
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView$a$b */
        public class C2251b {

            /* renamed from: a */
            public ImageView f12329a;

            public C2251b(C2249a aVar) {
            }
        }

        public C2249a(C2258w wVar) {
        }

        public int getCount() {
            ArrayList<String> arrayList = ExdeviceProfileAffectedUserView.this.f12325h;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        public Object getItem(int i) {
            return ExdeviceProfileAffectedUserView.this.f12325h.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C2251b bVar;
            C68097n Lo;
            String str = ExdeviceProfileAffectedUserView.this.f12325h.get(i);
            if (view == null) {
                view = LayoutInflater.from(ExdeviceProfileAffectedUserView.this.getContext()).inflate(C0966R.C0971layout.a4r, viewGroup, false);
                bVar = new C2251b(this);
                bVar.f12329a = (ImageView) view.findViewById(C0966R.C0970id.a1p);
                view.setTag(bVar);
            } else {
                bVar = (C2251b) view.getTag();
            }
            Runnable runnable = this.f12326d;
            C10581n eg = ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg();
            if (eg != null && ((Lo = ((C68098o) eg).mo93607Lo(str)) == null || Util.isNullOrNil(Lo.mo93597f()))) {
                C31519v2.m39436a().mo55988e(str, "", new C2245w(Util.nowMilliSecond(), runnable));
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106831cr(bVar.f12329a, str);
            return view;
        }
    }

    public ExdeviceProfileAffectedUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.a4j, this, true);
        this.f12322e = (TextView) inflate.findViewById(C0966R.C0970id.i4f);
        MMHorList mMHorList = (MMHorList) inflate.findViewById(C0966R.C0970id.i4e);
        this.f12323f = mMHorList;
        mMHorList.setCenterInParent(true);
        int b = C76577a.m92151b(context, 44);
        this.f12323f.setOverScrollEnabled(true);
        this.f12323f.setItemWidth(b);
        this.f12323f.setCenterInParent(true);
        C2249a aVar = new C2249a((C2258w) null);
        this.f12324g = aVar;
        this.f12323f.setAdapter((ListAdapter) aVar);
        this.f12323f.setOnItemClickListener(new C2258w(this, context));
        this.f12322e.setOnClickListener(new C2259x(this));
        setOnClickListener(new C2260y(this));
        setVisibility(8);
    }

    public void setAffectedUserInfo(ArrayList<String> arrayList) {
        this.f12325h = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            this.f12322e.setText("");
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f12322e.setText(getResources().getString(C0966R.string.ces, new Object[]{Integer.valueOf(this.f12325h.size())}));
        this.f12324g.notifyDataSetChanged();
    }

    public void setUsername(String str) {
        this.f12321d = str;
    }
}
