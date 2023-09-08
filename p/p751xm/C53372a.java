package p751xm;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.LinkedList;
import ld2.C46848g;
import md2.C47000b;
import p763ym.C53541m;

@C86522b
/* renamed from: xm.a */
public class C53372a extends C86301e implements C47000b {
    /* renamed from: D9 */
    public void mo72193D9(String str) {
        C46848g.Ax0().mo69369e(str);
    }

    public void E30(LinkedList<String> linkedList) {
        C46848g.Ax0().mo69366b(linkedList);
    }

    /* renamed from: FM */
    public C53541m mo72195FM() {
        return C46848g.Bx0();
    }

    /* renamed from: Nt */
    public Cursor mo72196Nt(int i) {
        C44579p Bx0 = C46848g.Bx0();
        Bx0.getClass();
        Cursor rawQuery = Bx0.rawQuery("select * from AppInfo where status = " + i + " order by modifyTime asc", new String[0]);
        if (rawQuery != null) {
            return rawQuery;
        }
        Log.m105920e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
        return null;
    }

    /* renamed from: Nz */
    public void mo72197Nz(C44561j jVar) {
        C46848g.Bx0().update(jVar, new String[0]);
    }

    public Bitmap V80(String str, int i, float f) {
        C44579p Bx0 = C46848g.Bx0();
        Bx0.getClass();
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppInfoStorage", "getIcon : invalid argument");
            return null;
        } else if (str.equals("wx7fa037cc7dfabad5")) {
            return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.f4482du);
        } else {
            String t2 = Bx0.mo69377t2(str, i);
            if (C86013q1.m106450k(t2)) {
                return BackwardSupportUtil.BitmapFactory.decodeFile(t2, f);
            }
            Log.m105920e("MicroMsg.AppInfoStorage", "icon does not exist, iconPath = " + t2 + ", iconType = " + i);
            return null;
        }
    }

    /* renamed from: be */
    public void mo72199be(C44561j jVar) {
        C44579p Bx0 = C46848g.Bx0();
        Bx0.getClass();
        if (jVar != null && jVar.field_status == 3) {
            jVar.field_status = 4;
            Bx0.update(jVar, new String[0]);
        }
    }

    /* renamed from: fl */
    public C44561j mo72200fl(String str) {
        return C46848g.Ax0().mo69367c(str, 3000);
    }

    public C44561j getAppInfo(String str) {
        if (!C86709a0.m107522a()) {
            return null;
        }
        return C46848g.Bx0().mo69371Lo(str);
    }

    /* renamed from: ir */
    public Cursor mo72202ir(int i, int i2) {
        return C46848g.Bx0().mo69374ir(i, i2);
    }

    /* renamed from: oG */
    public void mo72203oG(C44561j jVar) {
        C44579p Bx0 = C46848g.Bx0();
        Bx0.getClass();
        if (jVar != null && jVar.field_status != 5) {
            jVar.field_status = 3;
            Log.m105925i("MicroMsg.AppInfoStorage", "setBlack package name = %s", jVar.field_packageName);
            Bx0.update(jVar, new String[0]);
        }
    }

    public void pf0(String str, int i) {
        C46848g.zx0().mo69352a(str, i);
    }

    public Cursor re0(int[] iArr, boolean z) {
        String str;
        C44579p Bx0 = C46848g.Bx0();
        Bx0.getClass();
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        String str2 = "select * from AppInfo where ";
        for (int i = 0; i < iArr.length; i++) {
            str2 = str2 + " status = " + iArr[i];
            if (i < iArr.length - 1) {
                str2 = str2 + " or ";
            }
        }
        if (z) {
            str = str2 + " order by status desc, modifyTime asc";
        } else {
            str = str2 + " order by modifyTime asc";
        }
        Cursor rawQuery = Bx0.rawQuery(str, new String[0]);
        if (rawQuery != null) {
            return rawQuery;
        }
        Log.m105920e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
        return null;
    }

    /* renamed from: t2 */
    public String mo72206t2(String str, int i) {
        return C46848g.Bx0().mo69377t2(str, i);
    }

    /* renamed from: zl */
    public Cursor mo72207zl() {
        Cursor rawQuery = C46848g.Bx0().rawQuery("select * from AppInfo where serviceAppType > 0", new String[0]);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.AppInfoStorage", "getAllServices : cursor is null");
            return null;
        }
        Log.m105919d("MicroMsg.AppInfoStorage", "getAllServices count = %d", Integer.valueOf(rawQuery.getCount()));
        return rawQuery;
    }
}
