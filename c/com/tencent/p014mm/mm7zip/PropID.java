package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.PropID */
public enum PropID {
    NO_PROPERTY1,
    NO_PROPERTY2,
    HANDLER_ITEM_INDEX,
    PATH,
    NAME,
    EXTENSION,
    IS_FOLDER,
    SIZE,
    PACKED_SIZE,
    ATTRIBUTES,
    CREATION_TIME,
    LAST_ACCESS_TIME,
    LAST_MODIFICATION_TIME,
    SOLID,
    COMMENTED,
    ENCRYPTED,
    SPLIT_BEFORE,
    SPLIT_AFTER,
    DICTIONARY_SIZE,
    CRC,
    TYPE,
    IS_ANTI,
    METHOD,
    HOST_OS,
    FILE_SYSTEM,
    USER,
    GROUP,
    BLOCK,
    COMMENT,
    POSITION,
    PREFIX,
    NUM_SUB_DIRS,
    NUM_SUB_FILES,
    UNPACK_VER,
    VOLUME,
    IS_VOLUME,
    OFFSET,
    LINKS,
    NUM_BLOCKS,
    NUM_VOLUMES,
    TIME_TYPE,
    BIT64,
    BIG_ENDIAN,
    CPU,
    PHY_SIZE,
    HEADERS_SIZE,
    CHECKSUM,
    CHARACTS,
    VA,
    ID,
    SHORT_NAME,
    CREATOR_APP,
    SECTOR_SIZE,
    POSIX_ATTRIB,
    SYM_LINK,
    ERROR,
    TOTAL_SIZE,
    FREE_SPACE,
    CLUSTER_SIZE,
    VOLUME_NAME,
    LOCAL_NAME,
    PROVIDER,
    NT_SECURE,
    IS_ALT_STREAM,
    IS_AUX,
    IS_DELETED,
    IS_TREE,
    SHA1,
    SHA256,
    ERROR_TYPE,
    NUM_ERRORS,
    ERROR_FLAGS,
    WARNING_FLAGS,
    WARNING,
    NUM_STREAMS,
    NUM_ALT_STREAMS,
    ALT_STREAMS_SIZE,
    VIRTUAL_SIZE,
    UNPACK_SIZE,
    TOTAL_PHY_SIZE,
    VOLUME_INDEX,
    SUB_TYPE,
    SHORT_COMMENT,
    CODE_PAGE,
    IS_NOT_ARC_TYPE,
    PHY_SIZE_CANT_BE_DETECTED,
    ZEROS_TAIL_IS_ALLOWED,
    TAIL_SIZE,
    EMBEDDED_STUB_SIZE,
    NT_REPARSE,
    HARD_LINK,
    INODE,
    STREAM_ID,
    READ_ONLY,
    OUT_NAME,
    COPY_LINK,
    NUM_DEFINED,
    USER_DEFINED(65536),
    UNKNOWN(-1);
    
    private final int propIDIndex;

    /* renamed from: com.tencent.mm.mm7zip.PropID$AttributesBitMask */
    public static class AttributesBitMask {
        public static final int FILE_ATTRIBUTE_ARCHIVE = 32;
        public static final int FILE_ATTRIBUTE_COMPRESSED = 2048;
        public static final int FILE_ATTRIBUTE_DEVICE = 64;
        public static final int FILE_ATTRIBUTE_DIRECTORY = 16;
        public static final int FILE_ATTRIBUTE_ENCRYPTED = 16384;
        public static final int FILE_ATTRIBUTE_HIDDEN = 2;
        public static final int FILE_ATTRIBUTE_NORMAL = 128;
        public static final int FILE_ATTRIBUTE_OFFLINE = 4096;
        public static final int FILE_ATTRIBUTE_READONLY = 1;
        public static final int FILE_ATTRIBUTE_REPARSE_POINT = 1024;
        public static final int FILE_ATTRIBUTE_SPARSE_FILE = 512;
        public static final int FILE_ATTRIBUTE_SYSTEM = 4;
        public static final int FILE_ATTRIBUTE_TEMPORARY = 256;
        public static final int FILE_ATTRIBUTE_UNIX_EXTENSION = 32768;
    }

    private PropID(int i) {
        this.propIDIndex = i;
    }

    public static PropID getPropIDByIndex(int i) {
        if (i >= 0 && i < values().length && values()[i].getPropIDIndex() == i) {
            return values()[i];
        }
        int length = values().length;
        while (true) {
            length--;
            if (length == -1) {
                return UNKNOWN;
            }
            if (values()[length].getPropIDIndex() == i) {
                return values()[length];
            }
        }
    }

    public int getPropIDIndex() {
        return this.propIDIndex;
    }
}
