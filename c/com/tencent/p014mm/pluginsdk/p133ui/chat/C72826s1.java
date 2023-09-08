package com.tencent.p014mm.pluginsdk.p133ui.chat;

import a70.C112760b;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72813n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.s1 */
public class C72826s1 {

    /* renamed from: a */
    public Context f212224a;

    /* renamed from: b */
    public C72813n1 f212225b;

    /* renamed from: c */
    public C72810m1 f212226c;

    /* renamed from: d */
    public SharedPreferences f212227d;

    /* renamed from: e */
    public View f212228e = null;

    /* renamed from: f */
    public ImageView f212229f = null;

    /* renamed from: g */
    public Bitmap f212230g = null;

    /* renamed from: h */
    public C76901s0 f212231h;

    /* renamed from: i */
    public View f212232i;

    /* renamed from: j */
    public View f212233j;

    /* renamed from: k */
    public boolean f212234k = true;

    /* renamed from: l */
    public C72813n1.C72814a f212235l;

    /* renamed from: m */
    public C72827a f212236m;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.s1$a */
    public interface C72827a {
    }

    public C72826s1(Context context, View view, View view2, C72827a aVar) {
        this.f212224a = context;
        this.f212232i = view;
        this.f212233j = view2;
        this.f212225b = new C72813n1(context);
        this.f212227d = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        this.f212236m = aVar;
        View inflate = View.inflate(this.f212224a, C0966R.C0971layout.f6843q2, (ViewGroup) null);
        this.f212228e = inflate;
        this.f212229f = (ImageView) inflate.findViewById(C0966R.C0970id.iff);
        C76901s0 s0Var = new C76901s0(this.f212228e, -2, -2, false);
        this.f212231h = s0Var;
        s0Var.setBackgroundDrawable(new ColorDrawable(0));
        this.f212231h.setOutsideTouchable(true);
        this.f212228e.setOnClickListener(new C72816o1(this));
    }

    /* renamed from: a */
    public final float mo100665a(int i) {
        return TypedValue.applyDimension(1, (float) i, this.f212224a.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public C72810m1 mo100666b() {
        String str;
        C72813n1 n1Var = this.f212225b;
        if (n1Var == null) {
            Log.m105918d("MicroMsg.RecentImageBubble", "because of imageQuery == null");
            return null;
        }
        boolean z = true;
        ArrayList<C72810m1> a = n1Var.mo100636a(1, true);
        if (a == null || a.size() == 0) {
            Log.m105918d("MicroMsg.RecentImageBubble", "because of items == null || items.size() == 0");
            return null;
        }
        C72810m1 m1Var = a.get(0);
        if (m1Var != null) {
            if (Util.secondsToNow(m1Var.f212205c) < 0) {
                Log.m105921e("MicroMsg.RecentImageBubble", "we found u have a future pic that lead to forbid this featur. file : %s", m1Var.f212204b);
                return null;
            }
        }
        if (m1Var != null && (str = m1Var.f212204b) != null && str.contains(C112760b.m154218Z())) {
            return null;
        }
        if (m1Var != null) {
            if (Util.secondsToNow(m1Var.f212205c) <= 30) {
                if (!this.f212227d.getString("chattingui_recent_shown_image_path", "").equals(m1Var.f212204b)) {
                    return m1Var;
                }
                Log.m105918d("MicroMsg.RecentImageBubble", "because of recentImage.equals(imageItem.orginalPath)");
                return null;
            }
        }
        Object[] objArr = new Object[1];
        if (m1Var != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.RecentImageBubble", "because of checkAddDate(generateDate) == false, or imageItem == null : %s", objArr);
        return null;
    }
}
