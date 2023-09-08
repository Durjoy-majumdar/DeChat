package wr1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import qo3.C77398g;

/* renamed from: wr1.a */
public class C66179a implements C77398g.C77402i.C63297c {

    /* renamed from: a */
    public final /* synthetic */ View f190196a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f190197b;

    /* renamed from: c */
    public final /* synthetic */ String f190198c;

    /* renamed from: d */
    public final /* synthetic */ List f190199d;

    public C66179a(View view, ArrayList arrayList, String str, List list) {
        this.f190196a = view;
        this.f190197b = arrayList;
        this.f190198c = str;
        this.f190199d = list;
    }

    /* renamed from: a */
    public void mo88205a(boolean z) {
        Util.hideVKB(this.f190196a);
        if (this.f190197b.size() == 0 && z && !Util.isNullOrNil(this.f190198c)) {
            ArrayList arrayList = this.f190197b;
            List<String> list = this.f190199d;
            if (!Util.isNullOrNil((List) list)) {
                for (String displayName : list) {
                    arrayList.add(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(displayName));
                }
            }
        }
    }
}
