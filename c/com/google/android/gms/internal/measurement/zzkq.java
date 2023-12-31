package com.google.android.gms.internal.measurement;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83118q;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.xweb.util.WXWebReporter;

public final class zzkq extends zzaby<zzkq> {
    private static volatile zzkq[] zzatg;
    public String zzadl = null;
    public String zzadm = null;
    public String zzado = null;
    public String zzadt = null;
    public String zzaek = null;
    public String zzafn = null;
    public Integer zzath = null;
    public zzkn[] zzati = zzkn.zzll();
    public zzks[] zzatj = zzks.zzlo();
    public Long zzatk = null;
    public Long zzatl = null;
    public Long zzatm = null;
    public Long zzatn = null;
    public Long zzato = null;
    public String zzatp = null;
    public String zzatq = null;
    public String zzatr = null;
    public Integer zzats = null;
    public Long zzatt = null;
    public Long zzatu = null;
    public String zzatv = null;
    public Boolean zzatw = null;
    public Long zzatx = null;
    public Integer zzaty = null;
    public Boolean zzatz = null;
    public zzkm[] zzaua = zzkm.zzlk();
    public Integer zzaub = null;
    private Integer zzauc = null;
    private Integer zzaud = null;
    public String zzaue = null;
    public Long zzauf = null;
    public Long zzaug = null;
    public String zzauh = null;
    private String zzaui = null;
    public Integer zzauj = null;
    public String zzth = null;
    public String zzti = null;

    public zzkq() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static zzkq[] zzln() {
        if (zzatg == null) {
            synchronized (zzacc.zzbxg) {
                if (zzatg == null) {
                    zzatg = new zzkq[0];
                }
            }
        }
        return zzatg;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkq)) {
            return false;
        }
        zzkq zzkq = (zzkq) obj;
        Integer num = this.zzath;
        if (num == null) {
            if (zzkq.zzath != null) {
                return false;
            }
        } else if (!num.equals(zzkq.zzath)) {
            return false;
        }
        if (!zzacc.equals((Object[]) this.zzati, (Object[]) zzkq.zzati) || !zzacc.equals((Object[]) this.zzatj, (Object[]) zzkq.zzatj)) {
            return false;
        }
        Long l = this.zzatk;
        if (l == null) {
            if (zzkq.zzatk != null) {
                return false;
            }
        } else if (!l.equals(zzkq.zzatk)) {
            return false;
        }
        Long l2 = this.zzatl;
        if (l2 == null) {
            if (zzkq.zzatl != null) {
                return false;
            }
        } else if (!l2.equals(zzkq.zzatl)) {
            return false;
        }
        Long l3 = this.zzatm;
        if (l3 == null) {
            if (zzkq.zzatm != null) {
                return false;
            }
        } else if (!l3.equals(zzkq.zzatm)) {
            return false;
        }
        Long l4 = this.zzatn;
        if (l4 == null) {
            if (zzkq.zzatn != null) {
                return false;
            }
        } else if (!l4.equals(zzkq.zzatn)) {
            return false;
        }
        Long l5 = this.zzato;
        if (l5 == null) {
            if (zzkq.zzato != null) {
                return false;
            }
        } else if (!l5.equals(zzkq.zzato)) {
            return false;
        }
        String str = this.zzatp;
        if (str == null) {
            if (zzkq.zzatp != null) {
                return false;
            }
        } else if (!str.equals(zzkq.zzatp)) {
            return false;
        }
        String str2 = this.zzatq;
        if (str2 == null) {
            if (zzkq.zzatq != null) {
                return false;
            }
        } else if (!str2.equals(zzkq.zzatq)) {
            return false;
        }
        String str3 = this.zzatr;
        if (str3 == null) {
            if (zzkq.zzatr != null) {
                return false;
            }
        } else if (!str3.equals(zzkq.zzatr)) {
            return false;
        }
        String str4 = this.zzafn;
        if (str4 == null) {
            if (zzkq.zzafn != null) {
                return false;
            }
        } else if (!str4.equals(zzkq.zzafn)) {
            return false;
        }
        Integer num2 = this.zzats;
        if (num2 == null) {
            if (zzkq.zzats != null) {
                return false;
            }
        } else if (!num2.equals(zzkq.zzats)) {
            return false;
        }
        String str5 = this.zzadt;
        if (str5 == null) {
            if (zzkq.zzadt != null) {
                return false;
            }
        } else if (!str5.equals(zzkq.zzadt)) {
            return false;
        }
        String str6 = this.zzti;
        if (str6 == null) {
            if (zzkq.zzti != null) {
                return false;
            }
        } else if (!str6.equals(zzkq.zzti)) {
            return false;
        }
        String str7 = this.zzth;
        if (str7 == null) {
            if (zzkq.zzth != null) {
                return false;
            }
        } else if (!str7.equals(zzkq.zzth)) {
            return false;
        }
        Long l6 = this.zzatt;
        if (l6 == null) {
            if (zzkq.zzatt != null) {
                return false;
            }
        } else if (!l6.equals(zzkq.zzatt)) {
            return false;
        }
        Long l7 = this.zzatu;
        if (l7 == null) {
            if (zzkq.zzatu != null) {
                return false;
            }
        } else if (!l7.equals(zzkq.zzatu)) {
            return false;
        }
        String str8 = this.zzatv;
        if (str8 == null) {
            if (zzkq.zzatv != null) {
                return false;
            }
        } else if (!str8.equals(zzkq.zzatv)) {
            return false;
        }
        Boolean bool = this.zzatw;
        if (bool == null) {
            if (zzkq.zzatw != null) {
                return false;
            }
        } else if (!bool.equals(zzkq.zzatw)) {
            return false;
        }
        String str9 = this.zzadl;
        if (str9 == null) {
            if (zzkq.zzadl != null) {
                return false;
            }
        } else if (!str9.equals(zzkq.zzadl)) {
            return false;
        }
        Long l8 = this.zzatx;
        if (l8 == null) {
            if (zzkq.zzatx != null) {
                return false;
            }
        } else if (!l8.equals(zzkq.zzatx)) {
            return false;
        }
        Integer num3 = this.zzaty;
        if (num3 == null) {
            if (zzkq.zzaty != null) {
                return false;
            }
        } else if (!num3.equals(zzkq.zzaty)) {
            return false;
        }
        String str10 = this.zzaek;
        if (str10 == null) {
            if (zzkq.zzaek != null) {
                return false;
            }
        } else if (!str10.equals(zzkq.zzaek)) {
            return false;
        }
        String str11 = this.zzadm;
        if (str11 == null) {
            if (zzkq.zzadm != null) {
                return false;
            }
        } else if (!str11.equals(zzkq.zzadm)) {
            return false;
        }
        Boolean bool2 = this.zzatz;
        if (bool2 == null) {
            if (zzkq.zzatz != null) {
                return false;
            }
        } else if (!bool2.equals(zzkq.zzatz)) {
            return false;
        }
        if (!zzacc.equals((Object[]) this.zzaua, (Object[]) zzkq.zzaua)) {
            return false;
        }
        String str12 = this.zzado;
        if (str12 == null) {
            if (zzkq.zzado != null) {
                return false;
            }
        } else if (!str12.equals(zzkq.zzado)) {
            return false;
        }
        Integer num4 = this.zzaub;
        if (num4 == null) {
            if (zzkq.zzaub != null) {
                return false;
            }
        } else if (!num4.equals(zzkq.zzaub)) {
            return false;
        }
        Integer num5 = this.zzauc;
        if (num5 == null) {
            if (zzkq.zzauc != null) {
                return false;
            }
        } else if (!num5.equals(zzkq.zzauc)) {
            return false;
        }
        Integer num6 = this.zzaud;
        if (num6 == null) {
            if (zzkq.zzaud != null) {
                return false;
            }
        } else if (!num6.equals(zzkq.zzaud)) {
            return false;
        }
        String str13 = this.zzaue;
        if (str13 == null) {
            if (zzkq.zzaue != null) {
                return false;
            }
        } else if (!str13.equals(zzkq.zzaue)) {
            return false;
        }
        Long l9 = this.zzauf;
        if (l9 == null) {
            if (zzkq.zzauf != null) {
                return false;
            }
        } else if (!l9.equals(zzkq.zzauf)) {
            return false;
        }
        Long l15 = this.zzaug;
        if (l15 == null) {
            if (zzkq.zzaug != null) {
                return false;
            }
        } else if (!l15.equals(zzkq.zzaug)) {
            return false;
        }
        String str14 = this.zzauh;
        if (str14 == null) {
            if (zzkq.zzauh != null) {
                return false;
            }
        } else if (!str14.equals(zzkq.zzauh)) {
            return false;
        }
        String str15 = this.zzaui;
        if (str15 == null) {
            if (zzkq.zzaui != null) {
                return false;
            }
        } else if (!str15.equals(zzkq.zzaui)) {
            return false;
        }
        Integer num7 = this.zzauj;
        if (num7 == null) {
            if (zzkq.zzauj != null) {
                return false;
            }
        } else if (!num7.equals(zzkq.zzauj)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkq.zzbww);
        }
        zzaca zzaca2 = zzkq.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        Integer num = this.zzath;
        int i = 0;
        int hashCode = (((((-1033079920 + (num == null ? 0 : num.hashCode())) * 31) + zzacc.hashCode((Object[]) this.zzati)) * 31) + zzacc.hashCode((Object[]) this.zzatj)) * 31;
        Long l = this.zzatk;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.zzatl;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.zzatm;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.zzatn;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.zzato;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.zzatp;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzatq;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzatr;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zzafn;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.zzats;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.zzadt;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzti;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zzth;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l6 = this.zzatt;
        int hashCode15 = (hashCode14 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.zzatu;
        int hashCode16 = (hashCode15 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.zzatv;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.zzatw;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.zzadl;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l8 = this.zzatx;
        int hashCode20 = (hashCode19 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num3 = this.zzaty;
        int hashCode21 = (hashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.zzaek;
        int hashCode22 = (hashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.zzadm;
        int hashCode23 = (hashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.zzatz;
        int hashCode24 = (((hashCode23 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + zzacc.hashCode((Object[]) this.zzaua)) * 31;
        String str12 = this.zzado;
        int hashCode25 = (hashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.zzaub;
        int hashCode26 = (hashCode25 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.zzauc;
        int hashCode27 = (hashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.zzaud;
        int hashCode28 = (hashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.zzaue;
        int hashCode29 = (hashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l9 = this.zzauf;
        int hashCode30 = (hashCode29 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l15 = this.zzaug;
        int hashCode31 = (hashCode30 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str14 = this.zzauh;
        int hashCode32 = (hashCode31 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.zzaui;
        int hashCode33 = (hashCode32 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.zzauj;
        int hashCode34 = (hashCode33 + (num7 == null ? 0 : num7.hashCode())) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode34 + i;
    }

    public final int zza() {
        int zza = super.zza();
        Integer num = this.zzath;
        if (num != null) {
            zza += zzabw.zzf(1, num.intValue());
        }
        zzkn[] zzknArr = this.zzati;
        int i = 0;
        if (zzknArr != null && zzknArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkn[] zzknArr2 = this.zzati;
                if (i2 >= zzknArr2.length) {
                    break;
                }
                zzkn zzkn = zzknArr2[i2];
                if (zzkn != null) {
                    zza += zzabw.zzb(2, (zzace) zzkn);
                }
                i2++;
            }
        }
        zzks[] zzksArr = this.zzatj;
        if (zzksArr != null && zzksArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzks[] zzksArr2 = this.zzatj;
                if (i3 >= zzksArr2.length) {
                    break;
                }
                zzks zzks = zzksArr2[i3];
                if (zzks != null) {
                    zza += zzabw.zzb(3, (zzace) zzks);
                }
                i3++;
            }
        }
        Long l = this.zzatk;
        if (l != null) {
            zza += zzabw.zzc(4, l.longValue());
        }
        Long l2 = this.zzatl;
        if (l2 != null) {
            zza += zzabw.zzc(5, l2.longValue());
        }
        Long l3 = this.zzatm;
        if (l3 != null) {
            zza += zzabw.zzc(6, l3.longValue());
        }
        Long l4 = this.zzato;
        if (l4 != null) {
            zza += zzabw.zzc(7, l4.longValue());
        }
        String str = this.zzatp;
        if (str != null) {
            zza += zzabw.zzc(8, str);
        }
        String str2 = this.zzatq;
        if (str2 != null) {
            zza += zzabw.zzc(9, str2);
        }
        String str3 = this.zzatr;
        if (str3 != null) {
            zza += zzabw.zzc(10, str3);
        }
        String str4 = this.zzafn;
        if (str4 != null) {
            zza += zzabw.zzc(11, str4);
        }
        Integer num2 = this.zzats;
        if (num2 != null) {
            zza += zzabw.zzf(12, num2.intValue());
        }
        String str5 = this.zzadt;
        if (str5 != null) {
            zza += zzabw.zzc(13, str5);
        }
        String str6 = this.zzti;
        if (str6 != null) {
            zza += zzabw.zzc(14, str6);
        }
        String str7 = this.zzth;
        if (str7 != null) {
            zza += zzabw.zzc(16, str7);
        }
        Long l5 = this.zzatt;
        if (l5 != null) {
            zza += zzabw.zzc(17, l5.longValue());
        }
        Long l6 = this.zzatu;
        if (l6 != null) {
            zza += zzabw.zzc(18, l6.longValue());
        }
        String str8 = this.zzatv;
        if (str8 != null) {
            zza += zzabw.zzc(19, str8);
        }
        Boolean bool = this.zzatw;
        if (bool != null) {
            bool.booleanValue();
            zza += zzabw.zzaq(20) + 1;
        }
        String str9 = this.zzadl;
        if (str9 != null) {
            zza += zzabw.zzc(21, str9);
        }
        Long l7 = this.zzatx;
        if (l7 != null) {
            zza += zzabw.zzc(22, l7.longValue());
        }
        Integer num3 = this.zzaty;
        if (num3 != null) {
            zza += zzabw.zzf(23, num3.intValue());
        }
        String str10 = this.zzaek;
        if (str10 != null) {
            zza += zzabw.zzc(24, str10);
        }
        String str11 = this.zzadm;
        if (str11 != null) {
            zza += zzabw.zzc(25, str11);
        }
        Long l8 = this.zzatn;
        if (l8 != null) {
            zza += zzabw.zzc(26, l8.longValue());
        }
        Boolean bool2 = this.zzatz;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += zzabw.zzaq(28) + 1;
        }
        zzkm[] zzkmArr = this.zzaua;
        if (zzkmArr != null && zzkmArr.length > 0) {
            while (true) {
                zzkm[] zzkmArr2 = this.zzaua;
                if (i >= zzkmArr2.length) {
                    break;
                }
                zzkm zzkm = zzkmArr2[i];
                if (zzkm != null) {
                    zza += zzabw.zzb(29, (zzace) zzkm);
                }
                i++;
            }
        }
        String str12 = this.zzado;
        if (str12 != null) {
            zza += zzabw.zzc(30, str12);
        }
        Integer num4 = this.zzaub;
        if (num4 != null) {
            zza += zzabw.zzf(31, num4.intValue());
        }
        Integer num5 = this.zzauc;
        if (num5 != null) {
            zza += zzabw.zzf(32, num5.intValue());
        }
        Integer num6 = this.zzaud;
        if (num6 != null) {
            zza += zzabw.zzf(33, num6.intValue());
        }
        String str13 = this.zzaue;
        if (str13 != null) {
            zza += zzabw.zzc(34, str13);
        }
        Long l9 = this.zzauf;
        if (l9 != null) {
            zza += zzabw.zzc(35, l9.longValue());
        }
        Long l15 = this.zzaug;
        if (l15 != null) {
            zza += zzabw.zzc(36, l15.longValue());
        }
        String str14 = this.zzauh;
        if (str14 != null) {
            zza += zzabw.zzc(37, str14);
        }
        String str15 = this.zzaui;
        if (str15 != null) {
            zza += zzabw.zzc(38, str15);
        }
        Integer num7 = this.zzauj;
        return num7 != null ? zza + zzabw.zzf(39, num7.intValue()) : zza;
    }

    public final void zza(zzabw zzabw) {
        Integer num = this.zzath;
        if (num != null) {
            zzabw.zze(1, num.intValue());
        }
        zzkn[] zzknArr = this.zzati;
        int i = 0;
        if (zzknArr != null && zzknArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkn[] zzknArr2 = this.zzati;
                if (i2 >= zzknArr2.length) {
                    break;
                }
                zzkn zzkn = zzknArr2[i2];
                if (zzkn != null) {
                    zzabw.zza(2, (zzace) zzkn);
                }
                i2++;
            }
        }
        zzks[] zzksArr = this.zzatj;
        if (zzksArr != null && zzksArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzks[] zzksArr2 = this.zzatj;
                if (i3 >= zzksArr2.length) {
                    break;
                }
                zzks zzks = zzksArr2[i3];
                if (zzks != null) {
                    zzabw.zza(3, (zzace) zzks);
                }
                i3++;
            }
        }
        Long l = this.zzatk;
        if (l != null) {
            zzabw.zzb(4, l.longValue());
        }
        Long l2 = this.zzatl;
        if (l2 != null) {
            zzabw.zzb(5, l2.longValue());
        }
        Long l3 = this.zzatm;
        if (l3 != null) {
            zzabw.zzb(6, l3.longValue());
        }
        Long l4 = this.zzato;
        if (l4 != null) {
            zzabw.zzb(7, l4.longValue());
        }
        String str = this.zzatp;
        if (str != null) {
            zzabw.zzb(8, str);
        }
        String str2 = this.zzatq;
        if (str2 != null) {
            zzabw.zzb(9, str2);
        }
        String str3 = this.zzatr;
        if (str3 != null) {
            zzabw.zzb(10, str3);
        }
        String str4 = this.zzafn;
        if (str4 != null) {
            zzabw.zzb(11, str4);
        }
        Integer num2 = this.zzats;
        if (num2 != null) {
            zzabw.zze(12, num2.intValue());
        }
        String str5 = this.zzadt;
        if (str5 != null) {
            zzabw.zzb(13, str5);
        }
        String str6 = this.zzti;
        if (str6 != null) {
            zzabw.zzb(14, str6);
        }
        String str7 = this.zzth;
        if (str7 != null) {
            zzabw.zzb(16, str7);
        }
        Long l5 = this.zzatt;
        if (l5 != null) {
            zzabw.zzb(17, l5.longValue());
        }
        Long l6 = this.zzatu;
        if (l6 != null) {
            zzabw.zzb(18, l6.longValue());
        }
        String str8 = this.zzatv;
        if (str8 != null) {
            zzabw.zzb(19, str8);
        }
        Boolean bool = this.zzatw;
        if (bool != null) {
            zzabw.zza(20, bool.booleanValue());
        }
        String str9 = this.zzadl;
        if (str9 != null) {
            zzabw.zzb(21, str9);
        }
        Long l7 = this.zzatx;
        if (l7 != null) {
            zzabw.zzb(22, l7.longValue());
        }
        Integer num3 = this.zzaty;
        if (num3 != null) {
            zzabw.zze(23, num3.intValue());
        }
        String str10 = this.zzaek;
        if (str10 != null) {
            zzabw.zzb(24, str10);
        }
        String str11 = this.zzadm;
        if (str11 != null) {
            zzabw.zzb(25, str11);
        }
        Long l8 = this.zzatn;
        if (l8 != null) {
            zzabw.zzb(26, l8.longValue());
        }
        Boolean bool2 = this.zzatz;
        if (bool2 != null) {
            zzabw.zza(28, bool2.booleanValue());
        }
        zzkm[] zzkmArr = this.zzaua;
        if (zzkmArr != null && zzkmArr.length > 0) {
            while (true) {
                zzkm[] zzkmArr2 = this.zzaua;
                if (i >= zzkmArr2.length) {
                    break;
                }
                zzkm zzkm = zzkmArr2[i];
                if (zzkm != null) {
                    zzabw.zza(29, (zzace) zzkm);
                }
                i++;
            }
        }
        String str12 = this.zzado;
        if (str12 != null) {
            zzabw.zzb(30, str12);
        }
        Integer num4 = this.zzaub;
        if (num4 != null) {
            zzabw.zze(31, num4.intValue());
        }
        Integer num5 = this.zzauc;
        if (num5 != null) {
            zzabw.zze(32, num5.intValue());
        }
        Integer num6 = this.zzaud;
        if (num6 != null) {
            zzabw.zze(33, num6.intValue());
        }
        String str13 = this.zzaue;
        if (str13 != null) {
            zzabw.zzb(34, str13);
        }
        Long l9 = this.zzauf;
        if (l9 != null) {
            zzabw.zzb(35, l9.longValue());
        }
        Long l15 = this.zzaug;
        if (l15 != null) {
            zzabw.zzb(36, l15.longValue());
        }
        String str14 = this.zzauh;
        if (str14 != null) {
            zzabw.zzb(37, str14);
        }
        String str15 = this.zzaui;
        if (str15 != null) {
            zzabw.zzb(38, str15);
        }
        Integer num7 = this.zzauj;
        if (num7 != null) {
            zzabw.zze(39, num7.intValue());
        }
        super.zza(zzabw);
    }

    public final /* synthetic */ zzace zzb(zzabv zzabv) {
        while (true) {
            int zzuw = zzabv.zzuw();
            switch (zzuw) {
                case 0:
                    return this;
                case 8:
                    this.zzath = Integer.valueOf(zzabv.zzuy());
                    break;
                case 18:
                    int zzb = zzach.zzb(zzabv, 18);
                    zzkn[] zzknArr = this.zzati;
                    int length = zzknArr == null ? 0 : zzknArr.length;
                    int i = zzb + length;
                    zzkn[] zzknArr2 = new zzkn[i];
                    if (length != 0) {
                        System.arraycopy(zzknArr, 0, zzknArr2, 0, length);
                    }
                    while (length < i - 1) {
                        zzkn zzkn = new zzkn();
                        zzknArr2[length] = zzkn;
                        zzabv.zza(zzkn);
                        zzabv.zzuw();
                        length++;
                    }
                    zzkn zzkn2 = new zzkn();
                    zzknArr2[length] = zzkn2;
                    zzabv.zza(zzkn2);
                    this.zzati = zzknArr2;
                    break;
                case 26:
                    int zzb2 = zzach.zzb(zzabv, 26);
                    zzks[] zzksArr = this.zzatj;
                    int length2 = zzksArr == null ? 0 : zzksArr.length;
                    int i2 = zzb2 + length2;
                    zzks[] zzksArr2 = new zzks[i2];
                    if (length2 != 0) {
                        System.arraycopy(zzksArr, 0, zzksArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        zzks zzks = new zzks();
                        zzksArr2[length2] = zzks;
                        zzabv.zza(zzks);
                        zzabv.zzuw();
                        length2++;
                    }
                    zzks zzks2 = new zzks();
                    zzksArr2[length2] = zzks2;
                    zzabv.zza(zzks2);
                    this.zzatj = zzksArr2;
                    break;
                case 32:
                    this.zzatk = Long.valueOf(zzabv.zzuz());
                    break;
                case 40:
                    this.zzatl = Long.valueOf(zzabv.zzuz());
                    break;
                case 48:
                    this.zzatm = Long.valueOf(zzabv.zzuz());
                    break;
                case 56:
                    this.zzato = Long.valueOf(zzabv.zzuz());
                    break;
                case 66:
                    this.zzatp = zzabv.readString();
                    break;
                case 74:
                    this.zzatq = zzabv.readString();
                    break;
                case 82:
                    this.zzatr = zzabv.readString();
                    break;
                case 90:
                    this.zzafn = zzabv.readString();
                    break;
                case 96:
                    this.zzats = Integer.valueOf(zzabv.zzuy());
                    break;
                case 106:
                    this.zzadt = zzabv.readString();
                    break;
                case 114:
                    this.zzti = zzabv.readString();
                    break;
                case 130:
                    this.zzth = zzabv.readString();
                    break;
                case 136:
                    this.zzatt = Long.valueOf(zzabv.zzuz());
                    break;
                case 144:
                    this.zzatu = Long.valueOf(zzabv.zzuz());
                    break;
                case 154:
                    this.zzatv = zzabv.readString();
                    break;
                case 160:
                    this.zzatw = Boolean.valueOf(zzabv.zzux());
                    break;
                case 170:
                    this.zzadl = zzabv.readString();
                    break;
                case WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED:
                    this.zzatx = Long.valueOf(zzabv.zzuz());
                    break;
                case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED:
                    this.zzaty = Integer.valueOf(zzabv.zzuy());
                    break;
                case 194:
                    this.zzaek = zzabv.readString();
                    break;
                case 202:
                    this.zzadm = zzabv.readString();
                    break;
                case 208:
                    this.zzatn = Long.valueOf(zzabv.zzuz());
                    break;
                case WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL:
                    this.zzatz = Boolean.valueOf(zzabv.zzux());
                    break;
                case 234:
                    int zzb3 = zzach.zzb(zzabv, 234);
                    zzkm[] zzkmArr = this.zzaua;
                    int length3 = zzkmArr == null ? 0 : zzkmArr.length;
                    int i3 = zzb3 + length3;
                    zzkm[] zzkmArr2 = new zzkm[i3];
                    if (length3 != 0) {
                        System.arraycopy(zzkmArr, 0, zzkmArr2, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        zzkm zzkm = new zzkm();
                        zzkmArr2[length3] = zzkm;
                        zzabv.zza(zzkm);
                        zzabv.zzuw();
                        length3++;
                    }
                    zzkm zzkm2 = new zzkm();
                    zzkmArr2[length3] = zzkm2;
                    zzabv.zza(zzkm2);
                    this.zzaua = zzkmArr2;
                    break;
                case 242:
                    this.zzado = zzabv.readString();
                    break;
                case WXWebReporter.KEY_TRY_FIX_DEX_FAILED:
                    this.zzaub = Integer.valueOf(zzabv.zzuy());
                    break;
                case 256:
                    this.zzauc = Integer.valueOf(zzabv.zzuy());
                    break;
                case CdnLogic.kGroupNoticeCDNAppType:
                    this.zzaud = Integer.valueOf(zzabv.zzuy());
                    break;
                case 274:
                    this.zzaue = zzabv.readString();
                    break;
                case 280:
                    this.zzauf = Long.valueOf(zzabv.zzuz());
                    break;
                case 288:
                    this.zzaug = Long.valueOf(zzabv.zzuz());
                    break;
                case C83118q.CTRL_INDEX:
                    this.zzauh = zzabv.readString();
                    break;
                case ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET:
                    this.zzaui = zzabv.readString();
                    break;
                case 312:
                    this.zzauj = Integer.valueOf(zzabv.zzuy());
                    break;
                default:
                    if (super.zza(zzabv, zzuw)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
