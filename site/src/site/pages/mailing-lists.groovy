layout 'layouts/main.groovy', true,
        pageTitle: 'The Apache Groovy programming language - Mailing-lists',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            include template: 'includes/support-navbar.groovy'
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            include template: 'includes/contribute-button.groovy'
                            h1 {
                                i(class: 'fa fa-envelope-o') {}
                                yield ' Mailing-lists'
                            }
                            p '''The Groovy mailing lists are a great way to interact with the Groovy developers and Groovy users.'''
                            hr(class: 'divider')

                            article {
                                h1 'Available lists'
                                table(class: 'table') {
                                    tr {
                                        td {
                                            h3 'users@groovy.apache.org'
                                            em 'General purpose list for questions and discussion about Groovy'
                                        }
                                        td { a(href: 'https://lists.apache.org/list.html?users@groovy.apache.org', 'Browse') }
                                        td { a(href: 'mailto:users-subscribe@groovy.apache.org', 'Subscribe') }
                                        td { a(href: 'mailto:users-unsubscribe@groovy.apache.org', 'Unsubscribe') }
                                        td { a(href: 'http://mail-archives.apache.org/mod_mbox/groovy-users/', 'Archive') }
                                    }
                                    tr {
                                        td {
                                            h3 'dev@groovy.apache.org'
                                            em 'More focused list about the language implementation and its evolution'
                                        }
                                        td { a(href: 'https://lists.apache.org/list.html?dev@groovy.apache.org', 'Browse') }
                                        td { a(href: 'mailto:dev-subscribe@groovy.apache.org', 'Subscribe') }
                                        td { a(href: 'mailto:dev-unsubscribe@groovy.apache.org', 'Unsubscribe') }
                                        td { a(href: 'http://mail-archives.apache.org/mod_mbox/groovy-dev/', 'Archive') }
                                    }
                                    tr {
                                        td {
                                            h3 'commits@groovy.apache.org'
                                            em 'Tracks all commits'
                                        }
                                        td { a(href: 'https://lists.apache.org/list.html?commits@groovy.apache.org', 'Browse') }
                                        td { a(href: 'mailto:commits-subscribe@groovy.apache.org', 'Subscribe') }
                                        td { a(href: 'mailto:commits-unsubscribe@groovy.apache.org', 'Unsubscribe') }
                                        td { a(href: 'http://mail-archives.apache.org/mod_mbox/groovy-commits/', 'Archive') }
                                    }
                                    tr {
                                        td {
                                            h3 'notifications@groovy.apache.org'
                                            em 'Contains JIRA and Github notifications'
                                        }
                                        td { a(href: 'https://lists.apache.org/list.html?notifications@groovy.apache.org', 'Browse') }
                                        td { a(href: 'mailto:notifications-subscribe@groovy.apache.org', 'Subscribe') }
                                        td { a(href: 'mailto:notifications-unsubscribe@groovy.apache.org', 'Unsubscribe') }
                                        td { a(href: 'http://mail-archives.apache.org/mod_mbox/groovy-notifications/', 'Archive') }
                                    }
                                }
                                hr(class: 'divider')

                                h2 'Alternative mailing list archives'
                                ul {
                                    li """
                                    You can also find archives on mail-archive.com: ${
                                        $a(href: 'https://www.mail-archive.com/users@groovy.apache.org/', 'users')} ${
                                        $a(href: 'https://www.mail-archive.com/dev@groovy.apache.org/', 'dev')} ${
                                        $a(href: 'https://www.mail-archive.com/commits@groovy.apache.org/', 'commits')} ${
                                        $a(href: 'https://www.mail-archive.com/notifications@groovy.apache.org/', 'notifications')
                                    }
                                    """

                                    li """
                                    You can also find some historic dev mailing list archives on MARC: ${
                                        $a(href: 'https://marc.info/?l=groovy-dev&r=1&s=groovy&q=b&w=4', 'groovy-dev')
                                    }
                                    """

                                    li """
                                    Historically, the mailing lists were also available through Nabble. These are archived on the Internet Archive: ${
                                        $a(href: 'https://web.archive.org/web/20210507154652/http://groovy.329449.n5.nabble.com/', 'combined')
                                    }
                                    """
                                }
                            }
                        }
                    }
                }
            }
        }
