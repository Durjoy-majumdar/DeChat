package com.tencent.p014mm.plugin.gallery.picker;

import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.gallery.picker.a */
public final class C30063a extends C87413o implements C32226l<Void, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f81326d;

    /* renamed from: e */
    public final /* synthetic */ List<GalleryItem$MediaItem> f81327e;

    /* renamed from: f */
    public final /* synthetic */ GalleryPickerFragment f81328f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30063a(long j, List<GalleryItem$MediaItem> list, GalleryPickerFragment galleryPickerFragment) {
        super(1);
        this.f81326d = j;
        this.f81327e = list;
        this.f81328f = galleryPickerFragment;
    }

    public Object invoke(Object obj) {
        Void voidR = (Void) obj;
        Log.m105924i("MicroMsg.GalleryPickerFragment", "load cost=" + this.f81326d + "ms size=" + this.f81327e.size());
        GalleryPickerFragment galleryPickerFragment = this.f81328f;
        int i = GalleryPickerFragment.f162770h;
        galleryPickerFragment.getClass();
        throw null;
    }
}
