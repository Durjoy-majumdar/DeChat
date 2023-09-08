package p609mp;

import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.storage.C72996z1;

/* renamed from: mp.a */
public final class C76802a {
    /* renamed from: a */
    public static String m92579a(ContactListExpandPreference contactListExpandPreference, int i) {
        C76803c cVar = contactListExpandPreference.f211662K;
        if (cVar == null) {
            return "";
        }
        C72741a aVar = (C72741a) cVar;
        return aVar.f211670g.mo108546d(i) ? ((C72996z1) aVar.f211670g.getItem(i)).getNickname() : "";
    }

    /* renamed from: b */
    public static String m92580b(ContactListExpandPreference contactListExpandPreference, int i) {
        C76803c cVar = contactListExpandPreference.f211662K;
        if (cVar == null) {
            return "";
        }
        C72741a aVar = (C72741a) cVar;
        return aVar.f211670g.mo108546d(i) ? ((C72996z1) aVar.f211670g.getItem(i)).mo73969n2() : "";
    }

    /* renamed from: c */
    public static String m92581c(ContactListExpandPreference contactListExpandPreference, int i) {
        C76803c cVar = contactListExpandPreference.f211662K;
        if (cVar == null) {
            return "";
        }
        C72741a aVar = (C72741a) cVar;
        return aVar.f211670g.mo108546d(i) ? ((C72996z1) aVar.f211670g.getItem(i)).getUsername() : "";
    }
}
