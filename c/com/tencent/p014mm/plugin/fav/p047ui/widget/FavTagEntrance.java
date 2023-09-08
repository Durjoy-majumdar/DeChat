package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import p629ny.C76979h;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import wq3.C111847h;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance */
public class FavTagEntrance extends LinearLayout implements MStorage.IOnStorageChange, C111847h {

    /* renamed from: d */
    public TextView f198062d;

    /* renamed from: e */
    public long f198063e = -1;

    /* renamed from: f */
    public String f198064f = String.valueOf(-1);

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance$a */
    public class C68931a implements View.OnClickListener {
        public C68931a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavTagEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("key_fav_scene", 1);
            intent.putExtra("key_fav_item_id", FavTagEntrance.this.f198063e);
            C100734q.m131875t0(FavTagEntrance.this.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavTagEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FavTagEntrance(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f198062d = (TextView) findViewById(C0966R.C0970id.f359343ke0);
        setOnClickListener(new C68931a());
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105919d("MicroMsg.FavTagEntrence", "on notify change event %s, favIDStr %s", str, this.f198064f);
        if (this.f198064f.equals(str)) {
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(this.f198063e);
            if (Yt == null) {
                Log.m105929w("MicroMsg.FavTagEntrence", "id[%d] info is null, return", Long.valueOf(this.f198063e));
                return;
            }
            setTagContent(Yt.field_tagProto.f186495e);
        }
    }

    public void setFavItemID(long j) {
        this.f198063e = j;
        this.f198064f = String.valueOf(j);
    }

    public void setTagContent(List<String> list) {
        String str;
        if (this.f198062d != null) {
            Context context = getContext();
            if (context == null || list == null || list.isEmpty()) {
                str = "";
            } else {
                str = list.get(0);
                String string = context.getResources().getString(C0966R.string.crx);
                for (int i = 1; i < list.size(); i++) {
                    str = str + string + list.get(i);
                }
            }
            if (Util.isNullOrNil(str)) {
                this.f198062d.setText("");
                this.f198062d.setHint(C0966R.string.cnw);
                return;
            }
            this.f198062d.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), str, this.f198062d.getTextSize()));
        }
    }
}
