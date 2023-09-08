package wd3;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import qo3.C77398g;

/* renamed from: wd3.v */
public class C65952v implements C77398g.C77402i.C63297c {

    /* renamed from: a */
    public final /* synthetic */ View f189616a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f189617b;

    /* renamed from: c */
    public final /* synthetic */ String f189618c;

    /* renamed from: d */
    public final /* synthetic */ List f189619d;

    public C65952v(View view, ArrayList arrayList, String str, List list) {
        this.f189616a = view;
        this.f189617b = arrayList;
        this.f189618c = str;
        this.f189619d = list;
    }

    /* renamed from: a */
    public void mo88205a(boolean z) {
        Util.hideVKB(this.f189616a);
        if (this.f189617b.size() == 0 && z && !Util.isNullOrNil(this.f189618c)) {
            ArrayList arrayList = this.f189617b;
            List<String> list = this.f189619d;
            if (!Util.isNullOrNil((List) list)) {
                for (String displayName : list) {
                    arrayList.add(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(displayName));
                }
            }
        }
    }
}
