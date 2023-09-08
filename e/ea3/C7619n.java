package ea3;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: ea3.n */
public class C7619n {

    /* renamed from: a */
    public HashMap<String, C7620a> f25902a = new HashMap<>();

    /* renamed from: ea3.n$a */
    public static class C7620a {

        /* renamed from: a */
        public int f25903a;

        /* renamed from: b */
        public int f25904b;

        /* renamed from: c */
        public String f25905c;
    }

    /* renamed from: a */
    public static void m7753a(Context context, String str, DialogInterface.OnClickListener onClickListener) {
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225668y = false;
        aVar.f225634Q = 3;
        iVar.f225714b.f225644a = context.getString(C0966R.string.lgh);
        if (!Util.isNullOrNil(str)) {
            C77389a aVar2 = iVar.f225714b;
            aVar2.f225618A = true;
            aVar2.f225661r = str;
        }
        iVar.f225714b.f225649f = true;
        iVar.f225714b.f225647d = context.getString(C0966R.string.lgg);
        iVar.f225714b.f225663t = context.getString(C0966R.string.a18);
        int color = context.getResources().getColor(C0966R.color.a1d);
        C77389a aVar3 = iVar.f225714b;
        aVar3.f225638U = color;
        aVar3.f225620C = onClickListener;
        iVar.f225714b.f225664u = context.getString(C0966R.string.f7926wf);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("key_webview_menu_haokan");
        if (mmkv.decodeBool("show_first_tips", true)) {
            mmkv.encode("show_first_tips", false);
            mmkv.apply();
            iVar.f225714b.f225645b = context.getString(C0966R.string.lgf);
        }
        iVar.mo107548a().show();
    }
}
