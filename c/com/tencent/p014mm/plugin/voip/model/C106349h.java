package com.tencent.p014mm.plugin.voip.model;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* renamed from: com.tencent.mm.plugin.voip.model.h */
public class C106349h {

    /* renamed from: a */
    public int f317324a = 0;

    /* renamed from: a */
    public byte[] mo152583a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C106353k kVar = new C106353k(byteArrayInputStream, byteArrayOutputStream);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        int d = (int) kVar.mo152635d(8, "SPS: profile_idc");
        kVar.mo152637f(8);
        kVar.mo152635d(8, "SPS: level_idc");
        kVar.mo152639h("SPS: seq_parameter_set_id");
        if (d == 100 || d == 110 || d == 122 || d == 144) {
            if (kVar.mo152636e("SPS: chroma_format_idc") == 3) {
                kVar.mo152637f(1);
            }
            kVar.mo152639h("SPS: bit_depth_luma_minus8");
            kVar.mo152639h("SPS: bit_depth_chroma_minus8");
            kVar.mo152637f(1);
            if (kVar.mo152633b(true)) {
                for (int i = 0; i < 8; i++) {
                    if (kVar.mo152633b(true)) {
                        if (i < 6) {
                            kVar.mo152638g(16);
                        } else {
                            kVar.mo152638g(64);
                        }
                    }
                }
            }
        }
        kVar.mo152639h("SPS: log2_max_frame_num_minus4");
        int e = kVar.mo152636e("SPS: pic_order_cnt_type");
        if (e == 0) {
            kVar.mo152639h("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (e == 1) {
            kVar.mo152637f(1);
            kVar.mo152639h("SPS: offset_for_non_ref_pic");
            kVar.mo152639h("SPS: offset_for_top_to_bottom_field");
            int e2 = kVar.mo152636e("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i2 = 0; i2 < e2; i2++) {
                kVar.mo152639h("SPS: offsetForRefFrame [" + i2 + "]");
            }
        }
        kVar.mo152639h("SPS: num_ref_frames");
        kVar.mo152637f(1);
        kVar.mo152639h("SPS: pic_width_in_mbs_minus1");
        kVar.mo152639h("SPS: pic_height_in_map_units_minus1");
        if (!kVar.mo152633b(true)) {
            kVar.mo152637f(1);
        }
        kVar.mo152637f(1);
        if (kVar.mo152633b(true)) {
            kVar.mo152639h("SPS: frame_crop_left_offset");
            kVar.mo152639h("SPS: frame_crop_right_offset");
            kVar.mo152639h("SPS: frame_crop_top_offset");
            kVar.mo152639h("SPS: frame_crop_bottom_offset");
        }
        if (kVar.mo152633b(false)) {
            Log.m105918d("[H264SPSModifier]", "vui_parameters_present_flag exist!! modify max_dec_frame_buffering");
            kVar.mo152640i(1);
            if (kVar.mo152633b(true) && ((int) kVar.mo152635d(8, "VUI: aspect_ratio")) == 255) {
                kVar.mo152637f(16);
                kVar.mo152637f(16);
            }
            if (kVar.mo152633b(true)) {
                kVar.mo152637f(1);
            }
            if (kVar.mo152633b(true)) {
                kVar.mo152637f(3);
                kVar.mo152637f(1);
                if (kVar.mo152633b(true)) {
                    kVar.mo152637f(8);
                    kVar.mo152637f(8);
                    kVar.mo152637f(8);
                }
            }
            if (kVar.mo152633b(true)) {
                kVar.mo152639h("VUI chroma_sample_loc_type_top_field");
                kVar.mo152639h("VUI chroma_sample_loc_type_bottom_field");
            }
            if (kVar.mo152633b(true)) {
                kVar.mo152637f(32);
                kVar.mo152637f(32);
                kVar.mo152637f(1);
            }
            boolean b = kVar.mo152633b(true);
            if (b) {
                mo152586d(kVar);
            }
            boolean b2 = kVar.mo152633b(true);
            if (b2) {
                mo152586d(kVar);
            }
            if (b || b2) {
                kVar.mo152637f(1);
            }
            kVar.mo152637f(1);
            if (kVar.mo152633b(false)) {
                Log.m105918d("TAG", "steve:VUI has bs restriction!!");
                kVar.mo152640i(1);
                kVar.mo152633b(true);
                kVar.mo152639h("VUI max_bytes_per_pic_denom");
                kVar.mo152639h("VUI max_bits_per_mb_denom");
                kVar.mo152639h("VUI log2_max_mv_length_horizontal");
                kVar.mo152639h("VUI log2_max_mv_length_vertical");
                kVar.mo152639h("VUI num_reorder_frames");
                kVar.mo152643l(1, "VUI: max_dec_frame_buffering");
            } else {
                Log.m105918d("TAG", "steve:VUI has NO bs restriction!!");
                kVar.mo152640i(1);
                kVar.mo152640i(1);
                kVar.mo152643l(0, "VUI: max_bytes_per_pic_denom");
                kVar.mo152643l(0, "VUI: max_bits_per_mb_denom");
                kVar.mo152643l(10, "VUI: log2_max_mv_length_horizontal");
                kVar.mo152643l(10, "VUI: log2_max_mv_length_vertical");
                kVar.mo152643l(0, "VUI: num_reorder_frames");
                kVar.mo152643l(1, "VUI: max_dec_frame_buffering");
            }
        } else {
            Log.m105918d("[H264SPSModifier]", "vui_parameters_present_flag NOT exist!! add max_dec_frame_buffering");
            kVar.mo152640i(1);
            kVar.mo152640i(0);
            kVar.mo152640i(0);
            kVar.mo152640i(0);
            kVar.mo152640i(0);
            kVar.mo152640i(0);
            kVar.mo152640i(0);
            kVar.mo152640i(0);
            kVar.mo152640i(0);
            kVar.mo152640i(1);
            kVar.mo152640i(1);
            kVar.mo152643l(0, "VUI: max_bytes_per_pic_denom");
            kVar.mo152643l(0, "VUI: max_bits_per_mb_denom");
            kVar.mo152643l(10, "VUI: log2_max_mv_length_horizontal");
            kVar.mo152643l(10, "VUI: log2_max_mv_length_vertical");
            kVar.mo152643l(0, "VUI: num_reorder_frames");
            kVar.mo152643l(1, "VUI: max_dec_frame_buffering");
        }
        kVar.mo152640i(1);
        kVar.mo152642k(0, 8 - kVar.f317381g);
        for (int i3 = kVar.f317381g; i3 < 8; i3++) {
            kVar.f317380f[i3] = 0;
        }
        kVar.f317381g = 0;
        kVar.mo152641j();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str = "";
        for (byte b3 : byteArray) {
            String hexString = Integer.toHexString(b3 & ExifInterface.MARKER);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            str = str + " " + hexString;
        }
        Log.m105918d("TAG", "new SPS:" + str);
        return byteArray;
    }

    /* renamed from: b */
    public boolean mo152584b(byte[] bArr) {
        C106353k kVar = new C106353k(new ByteArrayInputStream(bArr));
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        int d = (int) kVar.mo152635d(8, "SPS: profile_idc");
        if (d == 66) {
            this.f317324a |= 1;
            return false;
        }
        kVar.mo152637f(8);
        kVar.mo152635d(8, "SPS: level_idc");
        kVar.mo152639h("SPS: seq_parameter_set_id");
        if (d == 100 || d == 110 || d == 122 || d == 144) {
            if (kVar.mo152636e("SPS: chroma_format_idc") == 3) {
                kVar.mo152637f(1);
            }
            kVar.mo152639h("SPS: bit_depth_luma_minus8");
            kVar.mo152639h("SPS: bit_depth_chroma_minus8");
            kVar.mo152637f(1);
            if (kVar.mo152633b(true)) {
                for (int i = 0; i < 8; i++) {
                    if (kVar.mo152633b(true)) {
                        if (i < 6) {
                            kVar.mo152638g(16);
                        } else {
                            kVar.mo152638g(64);
                        }
                    }
                }
            }
        }
        kVar.mo152639h("SPS: log2_max_frame_num_minus4");
        int e = kVar.mo152636e("SPS: pic_order_cnt_type");
        if (e == 0) {
            kVar.mo152639h("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (e == 1) {
            kVar.mo152637f(1);
            kVar.mo152639h("SPS: offset_for_non_ref_pic");
            kVar.mo152639h("SPS: offset_for_top_to_bottom_field");
            int e2 = kVar.mo152636e("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i2 = 0; i2 < e2; i2++) {
                kVar.mo152639h("SPS: offsetForRefFrame [" + i2 + "]");
            }
        }
        if (kVar.mo152636e("SPS: num_ref_frames") >= 2) {
            this.f317324a |= 2;
        }
        kVar.mo152637f(1);
        kVar.mo152639h("SPS: pic_width_in_mbs_minus1");
        kVar.mo152639h("SPS: pic_height_in_map_units_minus1");
        if (!kVar.mo152633b(true)) {
            kVar.mo152637f(1);
        }
        kVar.mo152637f(1);
        if (kVar.mo152633b(true)) {
            kVar.mo152639h("SPS: frame_crop_left_offset");
            kVar.mo152639h("SPS: frame_crop_right_offset");
            kVar.mo152639h("SPS: frame_crop_top_offset");
            kVar.mo152639h("SPS: frame_crop_bottom_offset");
        }
        if (!kVar.mo152633b(true)) {
            return false;
        }
        Log.m105918d("[H264SPSModifier]", "vui_parameters_present_flag exist!! read num_reorder_frames");
        if (kVar.mo152633b(true) && ((int) kVar.mo152635d(8, "VUI: aspect_ratio")) == 255) {
            kVar.mo152637f(16);
            kVar.mo152637f(16);
        }
        if (kVar.mo152633b(true)) {
            kVar.mo152637f(1);
        }
        if (kVar.mo152633b(true)) {
            kVar.mo152637f(3);
            kVar.mo152637f(1);
            if (kVar.mo152633b(true)) {
                kVar.mo152637f(8);
                kVar.mo152637f(8);
                kVar.mo152637f(8);
            }
        }
        if (kVar.mo152633b(true)) {
            kVar.mo152639h("VUI chroma_sample_loc_type_top_field");
            kVar.mo152639h("VUI chroma_sample_loc_type_bottom_field");
        }
        if (kVar.mo152633b(true)) {
            kVar.mo152637f(32);
            kVar.mo152637f(32);
            kVar.mo152637f(1);
        }
        boolean b = kVar.mo152633b(true);
        if (b) {
            mo152586d(kVar);
        }
        boolean b2 = kVar.mo152633b(true);
        if (b2) {
            mo152586d(kVar);
        }
        if (b || b2) {
            kVar.mo152637f(1);
        }
        kVar.mo152637f(1);
        if (!kVar.mo152633b(true)) {
            return false;
        }
        kVar.mo152633b(true);
        kVar.mo152639h("VUI max_bytes_per_pic_denom");
        kVar.mo152639h("VUI max_bits_per_mb_denom");
        kVar.mo152639h("VUI log2_max_mv_length_horizontal");
        kVar.mo152639h("VUI log2_max_mv_length_vertical");
        int e3 = kVar.mo152636e("VUI num_reorder_frames");
        int e4 = kVar.mo152636e("VUI: max_dec_frame_buffering");
        if (e3 == 0) {
            return false;
        }
        Log.m105918d("[H264SPSModifier]", "steve: reorder_frame =" + e3 + ", mac_dec_buffering=" + e4);
        this.f317324a = this.f317324a | 4;
        return true;
    }

    /* renamed from: c */
    public boolean mo152585c(byte[] bArr) {
        C106353k kVar = new C106353k(new ByteArrayInputStream(bArr));
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152637f(8);
        kVar.mo152639h("Slice: first_mb_in_slice");
        int e = kVar.mo152636e("Slice: slice_type");
        Log.m105918d("TAG", "steve:slice_type:" + e);
        if (e != 1 && e != 6) {
            return false;
        }
        this.f317324a |= 8;
        return true;
    }

    /* renamed from: d */
    public final void mo152586d(C106353k kVar) {
        int e = kVar.mo152636e("SPS: cpb_cnt_minus1");
        kVar.mo152637f(4);
        kVar.mo152637f(4);
        for (int i = 0; i <= e; i++) {
            kVar.mo152639h("HRD: bit_rate_value_minus1");
            kVar.mo152639h("HRD: cpb_size_value_minus1");
            kVar.mo152637f(1);
        }
        kVar.mo152637f(5);
        kVar.mo152637f(5);
        kVar.mo152637f(5);
        kVar.mo152637f(5);
    }
}
