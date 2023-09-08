package xp3;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Process;
import android.os.SystemClock;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.xeffect.VLogDirector;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.ciimage.CIContext;
import gy3.C87412m;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import qr3.C110469c;
import sp3.C101692i;
import sp3.C110801c;
import sp3.C110804g;
import yp3.C112478a;

/* renamed from: xp3.g */
public final class C112170g extends C112165a {

    /* renamed from: d */
    public final String f335857d = "VLogDirectorMultiVideoCompositionEffect";

    /* renamed from: e */
    public VLogDirector f335858e;

    /* renamed from: f */
    public EffectManager f335859f;

    /* renamed from: g */
    public volatile C112168e f335860g;

    /* renamed from: h */
    public volatile boolean f335861h;

    /* renamed from: i */
    public volatile boolean f335862i;

    /* renamed from: j */
    public final Rect f335863j = new Rect();

    /* renamed from: k */
    public int f335864k;

    /* renamed from: l */
    public int f335865l;

    /* renamed from: m */
    public TextureInfo f335866m;

    /* renamed from: n */
    public C102710d f335867n = new C102710d("renderTracks");

    /* renamed from: o */
    public boolean f335868o = true;

    /* renamed from: p */
    public boolean f335869p = true;

    /* renamed from: q */
    public C112167c f335870q;

    /* renamed from: a */
    public TextureInfo mo163968a(CIContext cIContext, long j, List<C110804g> list) {
        TextureInfo textureInfo;
        VLogDirector vLogDirector;
        long j2 = j;
        C87412m.m108595h(cIContext, "context");
        C87412m.m108595h(list, "trackList");
        C112478a.m153623a(this.f335857d, "[hash:%d][thread:%d]renderTracks ", Integer.valueOf(hashCode()), Integer.valueOf(Process.myTid()));
        if (this.f335864k == 0 || this.f335865l == 0) {
            this.f335864k = cIContext.getRenderContext().width();
            this.f335865l = cIContext.getRenderContext().height();
            C112478a.m153625c(this.f335857d, "renderTracks renderSize " + this.f335864k + ", " + this.f335865l + ", assetSize: " + this.f335851b + ", crop: " + this.f335863j, new Object[0]);
        }
        if (this.f335858e == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            VLogDirector vLogDirector2 = new VLogDirector();
            this.f335858e = vLogDirector2;
            vLogDirector2.mo154915c();
            VLogDirector vLogDirector3 = this.f335858e;
            if (vLogDirector3 != null) {
                vLogDirector3.mo154919g(0, 0, this.f335851b.getWidth(), this.f335851b.getHeight());
            }
            if (!this.f335863j.isEmpty() && (vLogDirector = this.f335858e) != null) {
                Rect rect = this.f335863j;
                vLogDirector.mo154918f(rect.left, rect.top, rect.right, rect.bottom);
            }
            VLogDirector vLogDirector4 = this.f335858e;
            if (vLogDirector4 != null) {
                int i = this.f335864k;
                int i2 = this.f335865l;
                vLogDirector4.f319982c = i;
                vLogDirector4.f319983d = i2;
            }
            C112478a.m153625c(this.f335857d, "init vLogDirector:" + (SystemClock.elapsedRealtime() - elapsedRealtime), new Object[0]);
        }
        if (this.f335861h) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            VLogDirector vLogDirector5 = this.f335858e;
            if (vLogDirector5 != null) {
                vLogDirector5.mo154917e(this.f335859f);
            }
            this.f335861h = false;
            C112478a.m153625c(this.f335857d, "setVLogEffectMgr:" + (SystemClock.elapsedRealtime() - elapsedRealtime2), new Object[0]);
        }
        if (this.f335866m == null) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            TextureInfo newTextureInfo = CIContext.newTextureInfo(this.f335864k, this.f335865l);
            GLES20.glBindTexture(3553, newTextureInfo.textureID);
            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, newTextureInfo.width, newTextureInfo.height, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            GLES20.glBindTexture(3553, 0);
            this.f335866m = newTextureInfo;
            String str = this.f335857d;
            StringBuilder sb = new StringBuilder();
            sb.append("checkCreateOutputTexture texture.id:");
            TextureInfo textureInfo2 = this.f335866m;
            sb.append(textureInfo2 != null ? Integer.valueOf(textureInfo2.textureID) : null);
            sb.append(", cost:");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime3);
            C112478a.m153625c(str, sb.toString(), new Object[0]);
            this.f335862i = false;
        } else if (this.f335862i) {
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            TextureInfo newTextureInfo2 = CIContext.newTextureInfo(this.f335864k, this.f335865l);
            GLES20.glBindTexture(3553, newTextureInfo2.textureID);
            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, newTextureInfo2.width, newTextureInfo2.height, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            GLES20.glBindTexture(3553, 0);
            this.f335866m = newTextureInfo2;
            String str2 = this.f335857d;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ReCreateOutputTexture texture.id:");
            TextureInfo textureInfo3 = this.f335866m;
            sb4.append(textureInfo3 != null ? Integer.valueOf(textureInfo3.textureID) : null);
            sb4.append(", cost:");
            sb4.append(SystemClock.elapsedRealtime() - elapsedRealtime4);
            C112478a.m153625c(str2, sb4.toString(), new Object[0]);
            this.f335862i = false;
        }
        LinkedList linkedList = new LinkedList();
        for (C110804g gVar : list) {
            TextureInfo textureInfo4 = gVar.f331492b;
            C110469c cVar = new C110469c(textureInfo4.textureID, textureInfo4.width, textureInfo4.height, false, gVar.f331491a.f331473k);
            if (!gVar.f331491a.f331475m.isEmpty()) {
                cVar.f330358g.set(gVar.f331491a.f331475m);
            }
            C110801c cVar2 = gVar.f331491a;
            if (cVar2.f331476n) {
                if (!cVar2.f331474l.isEmpty()) {
                    cVar.f330359h.set(gVar.f331491a.f331474l);
                } else {
                    Rect rect2 = cVar.f330359h;
                    C110801c cVar3 = gVar.f331491a;
                    rect2.set(0, 0, cVar3.f331471i, cVar3.f331472j);
                    C101692i.m133583a(cVar.f330359h, new Rect(0, 0, this.f335851b.getWidth(), this.f335851b.getHeight()));
                }
            }
            linkedList.add(cVar);
        }
        C102710d dVar = this.f335867n;
        dVar.getClass();
        dVar.f303332d = SystemClock.elapsedRealtime();
        if (linkedList.size() > 0 && (textureInfo = this.f335866m) != null) {
            TextureInfo textureInfo5 = textureInfo.textureID > 0 ? textureInfo : null;
            if (textureInfo5 != null) {
                if (this.f335870q == null) {
                    this.f335870q = new C112167c();
                }
                C112167c cVar4 = this.f335870q;
                if (cVar4 != null) {
                    synchronized (cVar4) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr = cVar4.f335854a;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            GLES20.glGetIntegerv(iArr[i3], cVar4.f335855b, i3);
                            i3++;
                        }
                    }
                }
                C112168e eVar = this.f335860g;
                if (eVar != null) {
                    eVar.mo134637a(j2);
                }
                VLogDirector vLogDirector6 = this.f335858e;
                if (vLogDirector6 != null) {
                    vLogDirector6.mo154916d(linkedList, textureInfo5.textureID, j2);
                }
                C112167c cVar5 = this.f335870q;
                if (cVar5 != null) {
                    synchronized (cVar5) {
                        Logger.m144648v("GLBlendStateCache", "restore: params = " + Arrays.toString(cVar5.f335855b));
                        GLES20.glEnable(3042);
                        GLES20.glBlendEquation(cVar5.f335855b[0]);
                        int[] iArr2 = cVar5.f335855b;
                        GLES20.glBlendEquationSeparate(iArr2[1], iArr2[2]);
                        int[] iArr3 = cVar5.f335855b;
                        GLES20.glBlendFuncSeparate(iArr3[3], iArr3[4], iArr3[5], iArr3[6]);
                    }
                }
            }
        }
        if (this.f335868o) {
            GLES20.glFinish();
        }
        C102710d dVar2 = this.f335867n;
        long j3 = dVar2.f303332d;
        if (j3 > 0) {
            dVar2.f303329a += SystemClock.elapsedRealtime() - j3;
            dVar2.f303330b++;
        }
        dVar2.f303332d = 0;
        return this.f335866m;
    }

    /* renamed from: c */
    public void mo163970c(int i, int i2) {
        super.mo163970c(i, i2);
        if (this.f335864k != i || this.f335865l != i2) {
            this.f335864k = i;
            this.f335865l = i2;
            VLogDirector vLogDirector = this.f335858e;
            if (vLogDirector != null) {
                vLogDirector.mo154919g(0, 0, i, i2);
            }
            VLogDirector vLogDirector2 = this.f335858e;
            if (vLogDirector2 != null) {
                int i3 = this.f335864k;
                int i4 = this.f335865l;
                vLogDirector2.f319982c = i3;
                vLogDirector2.f319983d = i4;
            }
            this.f335862i = true;
        }
    }

    public void release() {
        String str;
        super.release();
        if (this.f335869p) {
            VLogDirector vLogDirector = this.f335858e;
            if (vLogDirector != null) {
                vLogDirector.mo154914b();
            }
            TextureInfo textureInfo = this.f335866m;
            if (textureInfo != null) {
                textureInfo.release();
            }
            this.f335866m = null;
            C112168e eVar = this.f335860g;
            if (eVar != null) {
                eVar.mo134638d();
            }
            if (this.f335868o) {
                String str2 = this.f335857d;
                C102710d dVar = this.f335867n;
                if (dVar.f303330b <= 0 || dVar.f303329a <= 0) {
                    str = "";
                } else {
                    str = dVar.f303333e + " totalFrame:" + dVar.f303330b + ", totalTime:" + dVar.f303329a + ", average cost:" + (((double) dVar.f303329a) / ((double) dVar.f303330b));
                }
                C112478a.m153625c(str2, str, new Object[0]);
            }
        }
    }
}
