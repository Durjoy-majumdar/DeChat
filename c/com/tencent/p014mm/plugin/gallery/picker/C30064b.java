package com.tencent.p014mm.plugin.gallery.picker;

import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.gallery.picker.b */
public final class C30064b extends C87413o implements C32226l<Void, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<GalleryItem$AlbumItem> f81329d;

    /* renamed from: e */
    public final /* synthetic */ long f81330e;

    /* renamed from: f */
    public final /* synthetic */ GalleryPickerFragment f81331f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30064b(LinkedList<GalleryItem$AlbumItem> linkedList, long j, GalleryPickerFragment galleryPickerFragment) {
        super(1);
        this.f81329d = linkedList;
        this.f81330e = j;
        this.f81331f = galleryPickerFragment;
    }

    public Object invoke(Object obj) {
        Void voidR = (Void) obj;
        List<T> B0 = C110818d0.m150900B0(this.f81329d);
        Log.m105924i("MicroMsg.GalleryPickerFragment", "load cost=" + this.f81330e + "ms size=" + ((ArrayList) B0).size());
        GalleryPickerFragment galleryPickerFragment = this.f81331f;
        int i = GalleryPickerFragment.f162770h;
        galleryPickerFragment.getClass();
        throw null;
    }
}
