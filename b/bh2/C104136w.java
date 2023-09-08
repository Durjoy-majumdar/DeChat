package bh2;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import bh2.C92259v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sx3.C110818d0;
import tj3.C111010h;

/* renamed from: bh2.w */
public final class C104136w {

    /* renamed from: a */
    public int f308124a;

    /* renamed from: b */
    public int f308125b;

    /* renamed from: c */
    public long f308126c;

    /* renamed from: d */
    public long f308127d = 33;

    /* renamed from: e */
    public C92259v f308128e = new C92259v();

    /* renamed from: f */
    public C104135u f308129f = new C104135u();

    /* renamed from: g */
    public int f308130g;

    /* renamed from: a */
    public final void mo145778a(List<String> list) {
        C87412m.m108594g(list, "imageList");
        C111010h hVar = new C111010h(MMApplicationContext.getContext());
        for (String next : list) {
            C92259v vVar = this.f308128e;
            vVar.getClass();
            C87412m.m108594g(next, "path");
            Log.m105924i("MicroMsg.Story.StoryImagePlayer", "addImage");
            C92259v.C92261b bVar = new C92259v.C92261b(vVar);
            bVar.f264071g = next;
            vVar.f264056a.add(bVar);
        }
        hVar.destroy();
    }

    /* renamed from: b */
    public final void mo145779b() {
        int i;
        C92259v.C92261b bVar;
        long currentTimeMillis = System.currentTimeMillis();
        GLES20.glViewport(0, 0, this.f308124a, this.f308125b);
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GLES20.glClear(16384);
        C92259v vVar = this.f308128e;
        long j = this.f308126c;
        int i2 = this.f308124a;
        int i3 = this.f308125b;
        synchronized (vVar) {
            C92259v.C92260a a = vVar.mo126252a(j);
            if (a != null) {
                if (a.f264060a >= 0) {
                    GLES20.glUseProgram(vVar.f264057b.f308016a);
                    if (a.f264061b > 0.0f) {
                        int i4 = a.f264060a;
                        if (i4 - 1 >= 0) {
                            C92259v.C92261b bVar2 = vVar.f264056a.get(i4 - 1);
                            C87412m.m108593f(bVar2, "playItems[playAction.index - 1]");
                            bVar = bVar2;
                        } else {
                            bVar = (C92259v.C92261b) C110818d0.m150923U(vVar.f264056a);
                        }
                        vVar.mo126253b(bVar);
                        vVar.f264057b.mo145761c(i2, i3, bVar.f264067c, bVar.f264068d, a.f264063d[0]);
                        GLES20.glUniform1f(vVar.f264057b.f308024i, a.f264061b);
                        GLES20.glActiveTexture(33984);
                        C104109b bVar3 = vVar.f264057b;
                        Bitmap bitmap = bVar.f264065a;
                        int i5 = bVar.f264069e;
                        if (i5 > 0) {
                            bVar3.getClass();
                        } else {
                            i5 = bVar3.mo145760b(bitmap, i5, false);
                        }
                        bVar.f264069e = i5;
                        C104109b bVar4 = vVar.f264057b;
                        bVar4.getClass();
                        GLES20.glBindTexture(3553, i5);
                        GLES20.glUniform1i(bVar4.f308021f, 0);
                        GLES20.glActiveTexture(33985);
                        C104109b bVar5 = vVar.f264057b;
                        Bitmap bitmap2 = bVar.f264066b;
                        int i6 = bVar.f264070f;
                        if (i6 > 0) {
                            bVar5.getClass();
                        } else {
                            i6 = bVar5.mo145760b(bitmap2, i6, false);
                        }
                        bVar.f264070f = i6;
                        C104109b bVar6 = vVar.f264057b;
                        bVar6.getClass();
                        GLES20.glBindTexture(3553, i6);
                        GLES20.glUniform1i(bVar6.f308022g, 1);
                        GLES20.glUniformMatrix4fv(vVar.f264057b.f308023h, 1, false, a.f264063d, 0);
                        vVar.f264057b.getClass();
                        GLES20.glDrawArrays(5, 0, 4);
                        i = 2;
                    } else {
                        i = 0;
                    }
                    if (a.f264062c > 0.0f) {
                        C92259v.C92261b bVar7 = vVar.f264056a.get(a.f264060a);
                        C87412m.m108593f(bVar7, "playItems[playAction.index]");
                        C92259v.C92261b bVar8 = bVar7;
                        vVar.mo126253b(bVar8);
                        C92259v.C92261b bVar9 = bVar8;
                        int i7 = i2;
                        int i8 = i;
                        vVar.f264057b.mo145761c(i7, i3, bVar8.f264067c, bVar8.f264068d, a.f264064e[0]);
                        GLES20.glUniform1f(vVar.f264057b.f308024i, a.f264062c);
                        GLES20.glActiveTexture(i8 + 33984);
                        C104109b bVar10 = vVar.f264057b;
                        Bitmap bitmap3 = bVar9.f264065a;
                        int i9 = bVar9.f264069e;
                        if (i9 > 0) {
                            bVar10.getClass();
                        } else {
                            i9 = bVar10.mo145760b(bitmap3, i9, false);
                        }
                        bVar9.f264069e = i9;
                        C104109b bVar11 = vVar.f264057b;
                        int i15 = i8 + 1;
                        bVar11.getClass();
                        GLES20.glBindTexture(3553, i9);
                        GLES20.glUniform1i(bVar11.f308021f, i8);
                        GLES20.glActiveTexture(33984 + i15);
                        C104109b bVar12 = vVar.f264057b;
                        Bitmap bitmap4 = bVar9.f264066b;
                        int i16 = bVar9.f264070f;
                        if (i16 > 0) {
                            bVar12.getClass();
                        } else {
                            i16 = bVar12.mo145760b(bitmap4, i16, false);
                        }
                        bVar9.f264070f = i16;
                        C104109b bVar13 = vVar.f264057b;
                        bVar13.getClass();
                        GLES20.glBindTexture(3553, i16);
                        GLES20.glUniform1i(bVar13.f308022g, i15);
                        GLES20.glUniformMatrix4fv(vVar.f264057b.f308023h, 1, false, a.f264064e, 0);
                        vVar.f264057b.getClass();
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
        }
        this.f308126c += this.f308127d;
        Log.m105924i("MicroMsg.Story.StoryImageVideoRender", "draw cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: c */
    public final void mo145780c() {
        C92259v vVar = this.f308128e;
        synchronized (vVar) {
            ArrayList<C92259v.C92261b> arrayList = vVar.f264056a;
            if (arrayList != null) {
                Iterator<C92259v.C92261b> it = arrayList.iterator();
                while (it.hasNext()) {
                    C92259v.C92261b next = it.next();
                    next.f264069e = 0;
                    next.f264070f = 0;
                }
            }
        }
        C92259v vVar2 = this.f308128e;
        vVar2.getClass();
        try {
            C111010h hVar = vVar2.f264058c;
            if (hVar != null) {
                hVar.destroy();
            }
            vVar2.f264058c = null;
        } catch (Exception unused) {
            vVar2.f264058c = null;
        }
        this.f308130g = 0;
    }
}
