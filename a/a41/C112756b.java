package a41;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m41.C117534a;
import ma1.C117543a;
import u24.C90599h;

/* renamed from: a41.b */
public class C112756b {

    /* renamed from: j */
    public static List<String> f337632j;

    /* renamed from: a */
    public int f337633a;

    /* renamed from: b */
    public String f337634b;

    /* renamed from: c */
    public String f337635c;

    /* renamed from: d */
    public String f337636d;

    /* renamed from: e */
    public boolean f337637e;

    /* renamed from: f */
    public boolean f337638f;

    /* renamed from: g */
    public boolean f337639g;

    /* renamed from: h */
    public boolean f337640h;

    /* renamed from: i */
    public int f337641i = -1;

    public C112756b(Object obj) {
        boolean z;
        if (obj == null || (obj instanceof C112756b)) {
            Object obj2 = "null";
            if (C117534a.m165786i()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Create SubstitutePage use illegal argument, page is ");
                sb.append(obj == null ? obj2 : obj);
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Create SubstitutePage use illegal argument, page is ");
            sb4.append(obj != null ? obj : obj2);
            Log.m105920e("SubstitutePage", sb4.toString());
        }
        this.f337633a = obj.hashCode();
        this.f337635c = obj.getClass().getSimpleName();
        this.f337634b = this.f337635c + "_" + this.f337633a;
        this.f337636d = obj.getClass().getCanonicalName();
        String simpleName = obj.getClass().getSimpleName();
        boolean z2 = true;
        if (!C90599h.m113511d(simpleName)) {
            if (f337632j == null) {
                f337632j = new ArrayList();
                String Y60 = C117543a.Cx0().Y60(C32735h.C32737c.clicfg_data_report_4tab_page_config, "MainUI|MvvmAddressUIFragment|FindMoreFriendsUI|MoreTabUI");
                if (!C90599h.m113511d(Y60)) {
                    for (String str : Y60.split("\\|")) {
                        if (!((ArrayList) f337632j).contains(str)) {
                            ((ArrayList) f337632j).add(str);
                        }
                    }
                }
            }
            Iterator it = ((ArrayList) f337632j).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C90599h.m113509b(simpleName, (String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        this.f337639g = z;
        boolean b = C90599h.m113509b(obj.getClass().getCanonicalName(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
        this.f337640h = b;
        this.f337638f = (!(obj instanceof Fragment) || b || this.f337639g) ? false : z2;
        this.f337637e = obj instanceof FragmentActivity;
    }

    /* renamed from: a */
    public boolean mo164512a(C112756b bVar) {
        return bVar != null && C90599h.m113509b(bVar.f337635c, this.f337635c) && C90599h.m113509b(bVar.f337636d, this.f337636d) && bVar.f337633a == this.f337633a;
    }

    public String toString() {
        return "SubstitutePage{pageHash=" + this.f337633a + ", simplePageName='" + this.f337635c + '\'' + ", canonicalPageName='" + this.f337636d + '\'' + ", stackDeep='" + this.f337641i + '\'' + ", isSubPage=" + this.f337638f + '\'' + ", isParentPage=" + this.f337637e + '\'' + ", isSubPage=" + this.f337638f + '\'' + ", is4TabOfLauncherUI=" + this.f337639g + '\'' + ", isChattingUIFragment=" + this.f337640h + '}';
    }
}
