package md2;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import di3.C7335d;
import di3.C86312j;
import java.util.LinkedList;
import p763ym.C53541m;

/* renamed from: md2.b */
public interface C47000b extends C7335d {

    /* renamed from: md2.b$a */
    public static class C34548a {
        /* renamed from: a */
        public static C47000b m40384a() {
            return (C47000b) C86312j.m106911c(C47000b.class);
        }
    }

    /* renamed from: D9 */
    void mo72193D9(String str);

    void E30(LinkedList<String> linkedList);

    /* renamed from: FM */
    C53541m mo72195FM();

    /* renamed from: Nt */
    Cursor mo72196Nt(int i);

    /* renamed from: Nz */
    void mo72197Nz(C44561j jVar);

    Bitmap V80(String str, int i, float f);

    /* renamed from: be */
    void mo72199be(C44561j jVar);

    /* renamed from: fl */
    C44561j mo72200fl(String str);

    C44561j getAppInfo(String str);

    /* renamed from: ir */
    Cursor mo72202ir(int i, int i2);

    /* renamed from: oG */
    void mo72203oG(C44561j jVar);

    void pf0(String str, int i);

    Cursor re0(int[] iArr, boolean z);

    /* renamed from: t2 */
    String mo72206t2(String str, int i);

    /* renamed from: zl */
    Cursor mo72207zl();
}
