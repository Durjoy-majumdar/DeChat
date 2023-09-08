package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.MenuItem;
import java.util.Map;
import nj3.C11184p0;
import rd0.C22222c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.r4 */
public class C74194r4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Map f217803d;

    /* renamed from: e */
    public final /* synthetic */ C22222c.C22225c f217804e;

    /* renamed from: f */
    public final /* synthetic */ String f217805f;

    /* renamed from: g */
    public final /* synthetic */ ChattingItemDyeingTemplate f217806g;

    public C74194r4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, Map map, C22222c.C22225c cVar, String str) {
        this.f217806g = chattingItemDyeingTemplate;
        this.f217803d = map;
        this.f217804e = cVar;
        this.f217805f = str;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 3) {
            ChattingItemDyeingTemplate.m87586y0(this.f217806g, this.f217803d, this.f217804e, this.f217805f, true);
        } else if (itemId == 4) {
            ChattingItemDyeingTemplate.m87586y0(this.f217806g, this.f217803d, this.f217804e, this.f217805f, false);
        }
    }
}
