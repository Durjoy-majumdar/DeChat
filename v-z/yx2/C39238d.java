package yx2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.File;
import java.util.List;
import p413ok.C77013b;
import p413ok.C77014c;
import sx3.C64197v;

/* renamed from: yx2.d */
public final class C39238d {

    /* renamed from: a */
    public static final C39238d f105557a = new C39238d();

    /* renamed from: b */
    public static boolean f105558b;

    /* renamed from: c */
    public static final List<String> f105559c = C64197v.m75537f("scene_shaderf.glsl", "scene_shaderv.glsl", "frag_framebuffer_plane.glsl", "vertex_framebuffer_plane.glsl", "texture_vertex_shader.glsl", "texture_fragment_shader.glsl", "bg_gradient_vertex_shader.glsl", "bg_gradient_fragment_shader.glsl");

    /* renamed from: a */
    public final void mo61996a(Context context) {
        C87412m.m108594g(context, "context");
        C77014c.f225001a = C39239f.f105560a;
        if (mo61997b(context)) {
            f105558b = true;
            Log.m105924i("MicroMsg.DynamicBackgroundManager", "all exist, return");
            return;
        }
        C77013b bVar = C77013b.f225000a;
        File file = new File(bVar.mo107338b(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        bVar.mo107337a(context, "scene_shaderf.glsl", bVar.mo107338b(context) + "scene_shaderf.glsl");
        bVar.mo107337a(context, "scene_shaderv.glsl", bVar.mo107338b(context) + "scene_shaderv.glsl");
        bVar.mo107337a(context, "frag_framebuffer_plane.glsl", bVar.mo107338b(context) + "frag_framebuffer_plane.glsl");
        bVar.mo107337a(context, "vertex_framebuffer_plane.glsl", bVar.mo107338b(context) + "vertex_framebuffer_plane.glsl");
        bVar.mo107337a(context, "texture_vertex_shader.glsl", bVar.mo107338b(context) + "texture_vertex_shader.glsl");
        bVar.mo107337a(context, "texture_fragment_shader.glsl", bVar.mo107338b(context) + "texture_fragment_shader.glsl");
        bVar.mo107337a(context, "bg_gradient_vertex_shader.glsl", bVar.mo107338b(context) + "bg_gradient_vertex_shader.glsl");
        bVar.mo107337a(context, "bg_gradient_fragment_shader.glsl", bVar.mo107338b(context) + "bg_gradient_fragment_shader.glsl");
        f105558b = mo61997b(context);
        Log.m105924i("MicroMsg.DynamicBackgroundManager", "init done, ready[" + f105558b + ']');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r7 != null) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61997b(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r7 = r7.getFilesDir()
            java.lang.String r7 = r7.getParent()
            if (r7 == 0) goto L_0x0028
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = java.io.File.separator
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            if (r7 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            java.lang.String r7 = ""
        L_0x002a:
            r0.append(r7)
            java.lang.String r7 = "appbrand/glsl/"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r0 = r0.exists()
            r1 = 0
            java.lang.String r2 = "MicroMsg.DynamicBackgroundManager"
            if (r0 != 0) goto L_0x004a
            java.lang.String r7 = "dir not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            return r1
        L_0x004a:
            java.util.List<java.lang.String> r0 = f105559c
            java.util.Iterator r0 = r0.iterator()
        L_0x0050:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x008b
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x0050
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r0 = " not exist"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            return r1
        L_0x008b:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yx2.C39238d.mo61997b(android.content.Context):boolean");
    }
}
