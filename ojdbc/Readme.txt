======================================================
Oracle Free Use Terms and Conditions (FUTC) License 
======================================================
https://www.oracle.com/downloads/licenses/oracle-free-license.html
===================================================================

ojdbc10-full.tar.gz - JDBC Thin Driver and Companion JARS
========================================================
This TAR archive (ojdbc10-full.tar.gz) contains the 19.21.0.0 release of the Oracle JDBC Thin driver(ojdbc10.jar), the Universal Connection Pool (ucp.jar) and other companion JARs grouped by category. 

(1) ojdbc10.jar (4560898 bytes) - 
(SHA1 Checksum: 333dc12263aa3ed527162c589daa02117cd7ee44)
Oracle JDBC Driver compatible with JDK8, JDK9, and JDK11;
(2) ucp.jar (1698338 bytes) - (SHA1 Checksum: 4e10b02d57891f8079621ec9999d5513e94b7881)
Universal Connection Pool classes for use with JDK8, JDK9, and JDK11 -- for performance, scalability, high availability, sharded and multitenant databases.
(3) ojdbc.policy (11922 bytes) - Sample security policy file for Oracle Database JDBC drivers

======================
Security Related JARs
======================
Java applications require some additional jars to use Oracle Wallets. 
You need to use all the three jars while using Oracle Wallets. 

(4) oraclepki.jar (308241 bytes ) - (SHA1 Checksum: 667c93bb3d7b3b23159936a510de1066a9f0cab5
Additional jar required to access Oracle Wallets from Java
(5) osdt_cert.jar (210561 bytes) - (SHA1 Checksum: 8340531c1f86b222900e8c7b542bd7f234fac476)
Additional jar required to access Oracle Wallets from Java
(6) osdt_core.jar (312514 bytes) - (SHA1 Checksum: 748473630815adadf8894d5e270d63fd371db86b)
Additional jar required to access Oracle Wallets from Java

=============================
JARs for NLS and XDK support 
=============================
(7) orai18n.jar (1664182 bytes) - (SHA1 Checksum: 47cf95607afdcae43d920760a26f61229518c0d1) 
Classes for NLS support
(8) xdb.jar (129355 bytes) - (SHA1 Checksum: 42809c754afc4907477fea93751510a24fb2e2ab)
Classes to support standard JDBC 4.x java.sql.SQLXML interface 
(9) xmlparserv2.jar (1935724 bytes) - (SHA1 Checksum: 71c78b788c668a9e331281abe1423d79ab096d7b)
Classes to support standard JDBC 4.x java.sql.SQLXML interface 
(10) xmlparserv2_sans_jaxp_services.jar (1933191 bytes) - (SHA1 Checksum: 861b484a01e78d4beec81f6902248bd27e53eab2) 
Classes to support standard JDBC 4.x java.sql.SQLXML interface

====================================================
JARs for Real Application Clusters(RAC), ADG, or DG 
====================================================
(11) ons.jar (156648 bytes ) - (SHA1 Checksum: f18b728a3aca6fece798a08aa918ef57395bfb67)
for use by the pure Java client-side Oracle Notification Services (ONS) daemon
(12) simplefan.jar (32397 bytes) - (SHA1 Checksum: 1b2b40ab08615e7366f03a2dc9014ef930df2b01)
Java APIs for subscribing to RAC events via ONS; simplefan policy and javadoc

==================================================================================
NOTE: The diagnosability JARs **SHOULD NOT** be used in the production environment. 
These JARs (ojdbc10_g.jar,ojdbc10dms.jar, ojdbc10dms_g.jar) are meant to be used in the 
development, testing, or pre-production environment to diagnose any JDBC related issues. 

=====================================
OJDBC - Diagnosability Related JARs
===================================== 

(13) ojdbc10_g.jar (7633157 bytes) - (SHA1 Checksum: c8774767ea723910d8b79ad4c2ad9ad3dcd07af7)
Same as ojdbc10.jar except compiled with "javac -g" and contains tracing code.

(14) ojdbc10dms.jar (6344462 bytes) - (SHA1 Checksum: 6a590ed455afa98787a8d0e54a21cee51bcfb93f)
Same as ojdbc10.jar, except that it contains instrumentation to support DMS and limited java.util.logging calls.

(15) ojdbc10dms_g.jar (7662960 bytes) - (SHA1 Checksum: 8a8e0d1aeec182241e14bac55f1ed8526ba7730e)
Same as ojdbc10_g.jar except that it contains instrumentation to support DMS.

(16) dms.jar (2194533 bytes) - (SHA1 Checksum: cb20f6da4888d906ae44013dbec2cec0880d9941)
dms.jar required for DMS-enabled JAR files.

==================================================================
Oracle JDBC and UCP - Javadoc and README
==================================================================

(17) JDBC-Javadoc-19c.jar (2311082 bytes) - JDBC API Reference 19c

(18) ucp-Javadoc-19c.jar (366793 bytes) - UCP Java API Reference 19c

(19) simplefan-Javadoc-19c.jar (84122 bytes) - Simplefan API Reference 19c 

(20) xdb-Javadoc-19c.jar (2861664 bytes) - XDB API Reference 19c 

(21) xmlparserv2-Javadoc-19c.jar (2861664 bytes) - xmlparserv2 API Reference 19c 

(22) Jdbc-Readme.txt: It contains general information about the JDBC driver and bugs that have been fixed in the 19.21.0.0 release. 

(23) UCP-Readme.txt: It contains general information about UCP and bugs that are fixed in the 19.21.0.0 release. 


=================
USAGE GUIDELINES
=================
Refer to the JDBC Developers Guide (https://docs.oracle.com/en/database/oracle/oracle-database/19/jjdbc/index.html) and Universal Connection Pool Developers Guide (https://docs.oracle.com/en/database/oracle/oracle-database/19/jjucp/index.html) for more details.
