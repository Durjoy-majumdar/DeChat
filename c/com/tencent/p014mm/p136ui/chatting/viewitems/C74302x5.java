package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Color;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.x5 */
public class C74302x5 {

    /* renamed from: a */
    public static final LinearLayout.LayoutParams f218223a = new LinearLayout.LayoutParams(-1, -2);

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x5$a */
    public static class C74303a implements Comparable<C74303a> {

        /* renamed from: d */
        public int f218224d;

        /* renamed from: e */
        public int f218225e;

        /* renamed from: f */
        public boolean f218226f;

        /* renamed from: g */
        public boolean f218227g;

        /* renamed from: h */
        public int f218228h;

        /* renamed from: i */
        public String f218229i;

        public int compareTo(Object obj) {
            C74303a aVar = (C74303a) obj;
            if (aVar != null) {
                return this.f218224d - aVar.f218224d;
            }
            Log.m105920e("MicroMsg.LineNode", "compareTo fail, should not be null");
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x5$b */
    public static class C74304b {

        /* renamed from: a */
        public int f218230a;

        /* renamed from: b */
        public int f218231b;

        /* renamed from: c */
        public int f218232c;

        /* renamed from: d */
        public boolean f218233d;

        /* renamed from: e */
        public boolean f218234e;

        /* renamed from: f */
        public int f218235f;
    }

    /* renamed from: a */
    public static int m88635a(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom, ex = " + e.getMessage());
            return i;
        }
    }
}
