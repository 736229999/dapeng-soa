package com.github.dapeng.soa.account.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

 冻结状态

        **/
        public enum AccountJournalFreezeStatus implements com.github.dapeng.org.apache.thrift.TEnum{
        
            /**
            *

 已解冻

            **/
            THAW(1),
          
            /**
            *

 冻结中

            **/
            FROZENIN(2),
          
            /**
            *

 部分冻结

            **/
            PARTIALFROZENIN(3);
          

        private final int value;

        private AccountJournalFreezeStatus(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static AccountJournalFreezeStatus findByValue(int value){
            switch(value){
            
                 case 1:
                    return THAW;
               
                 case 2:
                    return FROZENIN;
               
                 case 3:
                    return PARTIALFROZENIN;
               
               default:
                   return null;
            }
        }
        }
      