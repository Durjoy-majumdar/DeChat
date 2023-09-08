package xx2;

import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandTaskBar_AppearStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandTaskBar_ClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AddDeleteStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AppearStruct;

/* renamed from: xx2.a */
public class C26563a {

    /* renamed from: a */
    public String f73914a = "";

    /* renamed from: a */
    public int mo53503a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 6) {
            return 10;
        }
        if (i != 21) {
            return i != 22 ? 0 : 8;
        }
        return 9;
    }

    /* renamed from: b */
    public void mo53504b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16) {
        AppBrandTaskBar_AppearStruct appBrandTaskBar_AppearStruct = new AppBrandTaskBar_AppearStruct();
        appBrandTaskBar_AppearStruct.f69436d = appBrandTaskBar_AppearStruct.mo86045b("session_id", this.f73914a, true);
        appBrandTaskBar_AppearStruct.f69437e = (long) i;
        appBrandTaskBar_AppearStruct.f69438f = (long) i2;
        appBrandTaskBar_AppearStruct.f69439g = (long) i3;
        appBrandTaskBar_AppearStruct.f69440h = (long) i4;
        appBrandTaskBar_AppearStruct.f69441i = (long) i5;
        appBrandTaskBar_AppearStruct.f69442j = (long) i6;
        appBrandTaskBar_AppearStruct.f69443k = (long) i7;
        appBrandTaskBar_AppearStruct.f69444l = (long) i8;
        appBrandTaskBar_AppearStruct.f69445m = (long) i9;
        appBrandTaskBar_AppearStruct.f69446n = (long) i15;
        appBrandTaskBar_AppearStruct.f69447o = (long) i16;
        appBrandTaskBar_AppearStruct.mo86054n();
    }

    /* renamed from: c */
    public void mo53505c(int i, int i2, int i3, String str, int i4, int i5, int i6, int i7) {
        AppBrandTaskBar_Feed_AddDeleteStruct appBrandTaskBar_Feed_AddDeleteStruct = new AppBrandTaskBar_Feed_AddDeleteStruct();
        appBrandTaskBar_Feed_AddDeleteStruct.f69454d = appBrandTaskBar_Feed_AddDeleteStruct.mo86045b("session_id", this.f73914a, true);
        appBrandTaskBar_Feed_AddDeleteStruct.f69455e = appBrandTaskBar_Feed_AddDeleteStruct.mo86045b("action_type", String.valueOf(i), true);
        appBrandTaskBar_Feed_AddDeleteStruct.f69456f = (long) i2;
        appBrandTaskBar_Feed_AddDeleteStruct.f69457g = (long) i3;
        appBrandTaskBar_Feed_AddDeleteStruct.f69458h = appBrandTaskBar_Feed_AddDeleteStruct.mo86045b("content_id", str, true);
        appBrandTaskBar_Feed_AddDeleteStruct.f69459i = (long) i4;
        appBrandTaskBar_Feed_AddDeleteStruct.f69460j = (long) i5;
        appBrandTaskBar_Feed_AddDeleteStruct.f69461k = (long) i6;
        appBrandTaskBar_Feed_AddDeleteStruct.f69462l = (long) i7;
        appBrandTaskBar_Feed_AddDeleteStruct.mo86054n();
    }

    /* renamed from: d */
    public void mo53506d(int i, int i2, String str, int i3, String str2) {
        AppBrandTaskBar_Feed_AppearStruct appBrandTaskBar_Feed_AppearStruct = new AppBrandTaskBar_Feed_AppearStruct();
        appBrandTaskBar_Feed_AppearStruct.f69463d = appBrandTaskBar_Feed_AppearStruct.mo86045b("session_id", this.f73914a, true);
        appBrandTaskBar_Feed_AppearStruct.f69464e = (long) i;
        appBrandTaskBar_Feed_AppearStruct.f69465f = (long) i2;
        appBrandTaskBar_Feed_AppearStruct.f69466g = appBrandTaskBar_Feed_AppearStruct.mo86045b("conent_list", str, true);
        appBrandTaskBar_Feed_AppearStruct.f69467h = (long) i3;
        if (str2 != null) {
            appBrandTaskBar_Feed_AppearStruct.f69468i = appBrandTaskBar_Feed_AppearStruct.mo86045b("icon_appid", str2, true);
        }
        appBrandTaskBar_Feed_AppearStruct.mo86054n();
    }

    /* renamed from: e */
    public void mo53507e(int i, int i2, String str, int i3, String str2) {
        AppBrandTaskBar_ClickStruct appBrandTaskBar_ClickStruct = new AppBrandTaskBar_ClickStruct();
        appBrandTaskBar_ClickStruct.f69448d = appBrandTaskBar_ClickStruct.mo86045b("session_id", this.f73914a, true);
        appBrandTaskBar_ClickStruct.f69449e = (long) i;
        appBrandTaskBar_ClickStruct.f69450f = (long) i2;
        appBrandTaskBar_ClickStruct.f69451g = appBrandTaskBar_ClickStruct.mo86045b("content_id", str, true);
        appBrandTaskBar_ClickStruct.f69452h = (long) i3;
        if (str2 != null) {
            appBrandTaskBar_ClickStruct.f69453i = appBrandTaskBar_ClickStruct.mo86045b("icon_appid", str2, true);
        }
        appBrandTaskBar_ClickStruct.mo86054n();
    }
}
