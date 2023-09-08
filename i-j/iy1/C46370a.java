package iy1;

import android.os.Bundle;
import c30.C26827e;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.game.luggage.api.GameAtSomeoneConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import yx1.C53631b;

/* renamed from: iy1.a */
public final class C46370a {

    /* renamed from: a */
    public static C26827e f124960a;

    /* renamed from: b */
    public static List<String> f124961b = new ArrayList();

    /* renamed from: c */
    public static String f124962c = "";

    /* renamed from: d */
    public static boolean f124963d = true;

    /* renamed from: e */
    public static GameAtSomeoneConfig f124964e;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Liy1/a$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: iy1.a$a */
    public static final class C46371a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("identifier");
                String string2 = bundle.getString("jsonData");
                if (string != null && string2 != null) {
                    C53631b bVar = C53631b.C53634c.f150678a;
                    JSONObject jSONObject = new JSONObject(string2);
                    C53631b.C53633b bVar2 = bVar.f150677a.get(string);
                    if (bVar2 != null) {
                        bVar2.mo65758a(jSONObject);
                    }
                }
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Liy1/a$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: iy1.a$b */
    public static final class C46372b implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("identifier");
                String string2 = bundle.getString("jsonData");
                if (string != null && string2 != null) {
                    C53631b bVar = C53631b.C53634c.f150678a;
                    JSONObject jSONObject = new JSONObject(string2);
                    C53631b.C53633b bVar2 = bVar.f150677a.get(string);
                    if (bVar2 != null) {
                        bVar2.mo65759b(jSONObject);
                    }
                }
            }
        }
    }
}
